package onetomany_bi2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;





public class PhoneDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("emp");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Sim sim1=new Sim();
		sim1.setBrand("Airtel");
		sim1.setPrice(234);
		
		Sim sim2=new Sim();
		sim2.setBrand("Vodafone");
		sim2.setPrice(300);
		
		List<Sim> sims=new ArrayList<Sim>();
		sims.add(sim1);
		sims.add(sim2);
		
		Phone phone=new Phone();
		phone.setNumber(98934);
		phone.setBrand("apple");
		phone.setPrice(45000);
		phone.setSim(sims);
		
		
		et.begin();
//		em.persist(shoppingcart);
//		List<Items> items=shoppingcart.getItems();
//		
//		for(Items item:items)
//		{
//		em.persist(item);
//		}
		
		em.persist(phone);
		List<Sim> sims2=phone.getSim();
		for(Sim sim:sims2)
		{
			em.persist(sim);
		}
		et.commit();
		
		
	}
}
