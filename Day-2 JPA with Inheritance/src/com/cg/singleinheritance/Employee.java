package com.cg.singleinheritance;


	import java.io.Serializable;

	import javax.persistence.DiscriminatorColumn;
	import javax.persistence.DiscriminatorType;
	import javax.persistence.DiscriminatorValue;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Inheritance;
	import javax.persistence.InheritanceType;
	import javax.persistence.Table;
	@Entity
	@Table(name="Emp_Table")//name of table to be created
	@Inheritance(strategy=InheritanceType.SINGLE_TABLE)//single table inheritance type
	@DiscriminatorColumn(name="emp_type" ,discriminatorType=DiscriminatorType.STRING)//to take attributes of child cls in single table inheritance only
	@DiscriminatorValue("EMP")
	public class Employee implements Serializable 
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
