package manytomany_bi2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class StudentMain {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("emp");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Student student1 = new Student();
		student1.setAge(43);
		student1.setName("raj");
		student1.setPhone(234314);

		Student student2 = new Student();
		student2.setAge(23);
		student2.setName("darshan");
		student2.setPhone(54242);
		
		
		Teacher teacher = new Teacher();
		teacher.setAge(54);
		teacher.setName("abc");
		teacher.setPhone(65465);
	

		Teacher teacher1 = new Teacher();
		teacher1.setAge(38);
		teacher1.setName("qwe");
		teacher1.setPhone(8965);
		

		List<Student> list1 = new ArrayList<Student>();
		list1.add(student2);
		teacher.setStudent(list1);

		List<Student> list2 = new ArrayList<Student>();
		list2.add(student1);
		list2.add(student2);
		teacher1.setStudent(list2);
		
		List<Teacher> ls1=new ArrayList<Teacher>();
		ls1.add(teacher);
		student2.setTeachers(ls1);
		
		List<Teacher> ls2=new ArrayList<Teacher>();
		ls1.add(teacher);
		ls2.add(teacher1);
		student1.setTeachers(ls1);

	

		et.begin();
		em.persist(student1);
		em.persist(student2);
		em.persist(teacher);
		em.persist(teacher1);
		et.commit();

	}

}
