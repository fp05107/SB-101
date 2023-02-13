package com.masai;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
		EntityManager em = emf.createEntityManager();

//		Student student = em.find(Student.class, 10);
//		if (student != null)
//			System.out.println(student);
//		else
//			System.out.println("Student does not exist");
//		em.close();
		
		Student st1 = new Student(30, "subham", 900);
		em.getTransaction().begin();
		em.persist(st1);
		em.getTransaction().commit();
		em.clear();
		System.out.println("Done....");
	}

}
