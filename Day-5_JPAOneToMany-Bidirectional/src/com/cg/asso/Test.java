package com.cg.asso;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Test {

	public static void main(String[] args) 
	{

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		
		// create a new department
		Department dept=new Department();
		dept.setId(10);
		dept.setName("Kokil");
		
		
		Employee e1=new Employee();
		e1.setId(1001);
		e1.setName("Pallavi");
		e1.setSalary(45000);
		
		
		
		Employee e2=new Employee();
		e2.setId(1002);
		e2.setName("Akshay");
		e2.setSalary(55000);
		
		//add both employees to department
		dept.addEmployee(e1);
		dept.addEmployee(e2);
		
		//save depaqrtment and its employees using entity manager
		em.persist(dept);
		
		System.out.println("Added department along with two employees to database");
		em.getTransaction().commit();
		em.close();
		factory.close();
		
		

	}

}
