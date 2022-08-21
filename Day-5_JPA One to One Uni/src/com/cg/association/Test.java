package com.cg.association;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Employee e=new Employee();
		e.setEmployeeName("Chandana");
		
		Address a=new Address();
		a.setAddressId(10);
		a.setStreet("Takli Road");
		a.setCity("Pandharpur");
		a.setState("Maharashtra");

		e.setAddress(a);
		em.persist(e);
		System.out.println("Row is Inserted");
		
		em.getTransaction().commit();
		em.close();
		factory.close();
		

	}

}
