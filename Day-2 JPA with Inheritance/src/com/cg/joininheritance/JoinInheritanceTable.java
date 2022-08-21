package com.cg.joininheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JoinInheritanceTable {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		
		//employee 1
		EmployeeK emp4=new EmployeeK();
		emp4.setName("Sakshi");
		emp4.setSalary(30000);
		em.persist(emp4);
		
		
		//employee 2
		EmployeeK emp5=new EmployeeK();
		emp5.setName("Rutuja");
		emp5.setSalary(30000);
		em.persist(emp5);
		
		
		//create manager
		ManagerK m2 =new ManagerK();
		m2.setName("Akshay");
		m2.setSalary(80000);
		m2.setDeptName("IT");
		em.persist(m2);
		
		em.getTransaction().commit();
		System.out.println("data is added");
		em.close();
		factory.close();

	}

}
