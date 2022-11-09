package onetooone_bi2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class PersonMain {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("emp");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		AadharCard aadharcard=new AadharCard();
		aadharcard.setAadharname("Darshan J");
		aadharcard.setAadharnumber(753424882);
		
		
		Person person =new Person();
	    person.setGender("male");
	    person.setAge(23);
	    person.setName("Darshan");
	    person.setAadharcard(aadharcard);
	  
	  
	
	    

		
		et.begin();
		em.persist(person);
		em.persist(aadharcard);
		et.commit();
	}
}
