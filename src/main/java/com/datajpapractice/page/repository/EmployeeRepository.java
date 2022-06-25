package com.datajpapractice.page.repository;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import com.datajpapractice.page.Entity.Employee;



public interface EmployeeRepository{



	public List<Employee> findEmployeeById(Integer id);
	
	
	public Page<Employee> findEmployee(Pageable pageable);
	
	
	public List<Employee> findEmployee1(Pageable pageable);

 

	
	
}
