package com.datajpapractice.page.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	private int emp_id;
	private String emp_first_name;
	private String emp_last_name;
	private String emp_role;
	
	public Employee() {
		
	}
	
	
	public Employee(int emp_id, String emp_first_name, String emp_last_name, String emp_role) {
		super();
		this.emp_id = emp_id;
		this.emp_first_name = emp_first_name;
		this.emp_last_name = emp_last_name;
		this.emp_role = emp_role;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_first_name() {
		return emp_first_name;
	}
	public void setEmp_first_name(String emp_first_name) {
		this.emp_first_name = emp_first_name;
	}
	public String getEmp_last_name() {
		return emp_last_name;
	}
	public void setEmp_last_name(String emp_last_name) {
		this.emp_last_name = emp_last_name;
	}
	public String getEmp_role() {
		return emp_role;
	}
	public void setEmp_role(String emp_role) {
		this.emp_role = emp_role;
	}


	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_first_name=" + emp_first_name + ", emp_last_name=" + emp_last_name
				+ ", emp_role=" + emp_role + "]";
	}
	

	

}
