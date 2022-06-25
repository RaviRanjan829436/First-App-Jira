package com.datajpapractice.page.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.datajpapractice.page.Entity.Employee;
import com.datajpapractice.page.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	@GetMapping("/employee/{id}")
	public List<Employee> getEmployeeById(@PathVariable Integer id)
	{
		return empRepo.findEmployeeById(id);
	}
	
	//per page -10 per page 
	//current page --0 [page]
	
	@GetMapping("/employees")
	public Page<Employee> getEmployee(Pageable pageable)
	{
		//pageable = PageRequest.of(page, 2);
		
		Page<Employee> empPage = empRepo.findEmployee(pageable);
		
		/*
		 * System.out.println("Employees"+empPage);
		 * System.out.println("current page"+page);
		 * System.out.println("total page"+empPage.getTotalPages());
		 */
		
		return  empPage;
	}

	@GetMapping("/employeess/{page}")
	public List<Employee> getEmployee1(@PathVariable("page") Integer page)
	{
		Pageable pageable = PageRequest.of(page, 5);
		
		List<Employee> empPage = empRepo.findEmployee1(pageable);
		
		/*
		 * System.out.println("Employees"+empPage);
		 * System.out.println("current page"+page);
		 * System.out.println("total page"+empPage.getTotalPages());
		 */
		
		return  empPage;
	}

}
