package com.cg.service;

import com.cg.entities.Employee;

public interface EmployeeService 
{
	// by default all the methods are abstract in Interface
		void addEmployee(Employee emp);// creation
		void updateEmployee(Employee emp);//updation
		Employee getEmployeeById(int ID);//Retrieve
		void removeEmployee(Employee emp);//delete
		

}
