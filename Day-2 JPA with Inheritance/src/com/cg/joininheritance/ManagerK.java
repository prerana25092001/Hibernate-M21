package com.cg.joininheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="MGR_Table2")
public class ManagerK extends EmployeeK 
{
	private static final long serialVersionUID=1L;//for serializable
	private String deptName;
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	

}
