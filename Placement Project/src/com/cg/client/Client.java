package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.entities.Admin;
import com.cg.entities.User;
import com.cg.service.IUserService;
import com.cg.service.IUserServiceImpl;

public class Client {

	public static void main(String[] args)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		User u= new User();
		u.setName("Information");
		
		Admin a1=new Admin();
		a1.setId(1);
		a1.setName("Prerana");
		a1.setPassword("Pass@123");
		
		em.persist(a1);
		System.out.println("Get Information");
		
		em.getTransaction().commit();
		em.close();
		factory.close();
		
		
		
		
		
		

	}

}
