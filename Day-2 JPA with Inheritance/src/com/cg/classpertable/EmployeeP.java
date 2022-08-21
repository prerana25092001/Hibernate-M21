package com.cg.classpertable;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
@Entity
@Table(name="EMP_Table1")//name of table to be created
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)//single table inheritance type

public class EmployeeP implements Serializable 
{
	private static final long serialVersionUID=1L;//for serializable
	@Id //primary key
	@GeneratedValue(strategy=GenerationType.AUTO)//to add all 3 variable as column in mysql
	private int ID;
	private String Name;
	private double salary;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
