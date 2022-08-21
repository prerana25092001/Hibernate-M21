package com.cg.classpertable;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class ClassPerTableTest {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		
		//employee 1
		EmployeeP emp2=new EmployeeP();
		emp2.setName("Geeta");
		emp2.setSalary(30000);
		em.persist(emp2);
		
		
		//employee 2
		EmployeeP emp3=new EmployeeP();
		emp3.setName("Manali");
		emp3.setSalary(30000);
		em.persist(emp3);
		
		
		//create manager
		ManagerP m1 =new ManagerP();
		m1.setName("Pallavi");
		m1.setSalary(80000);
		m1.setDeptName("Finance");
		em.persist(m1);
		
		em.getTransaction().commit();
		System.out.println("data is added");
		em.close();
		factory.close();

	}

}