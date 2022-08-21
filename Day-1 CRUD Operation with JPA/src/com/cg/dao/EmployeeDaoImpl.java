package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao
{
	// we are going to use entity manager method - CRUD
	private EntityManager em;
	
     // default constructor
	public EmployeeDaoImpl() {
		super();
		em=JPAUtil.getEntityManager();
	}

	@Override
	// to add => persist(obj nm)
	public void addEmployee(Employee emp) 
	{
		em.persist(emp);
		
	}

	@Override
	// to update => merge(obj nm)
	public void updateEmployee(Employee emp)
	{
		em.merge(emp);
		
	}

	@Override
	// to retrive a data => find(classname,pk);
	public Employee getEmployeeById(int ID) {
		Employee emp=em.find(Employee.class, ID);
		return emp;
	}

	@Override
	//to remove => remove(obj nm)
	public void removeEmployee(Employee emp)
	{
		em.remove(emp);
		
	}
    // transaction method to start and close the entity manager
	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}

}
