package com.datajpapractice.page.repository.jpa;

import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.datajpapractice.page.Entity.Employee;
import com.datajpapractice.page.repository.EmployeeRepository;

@Repository
public class EmployeeRepositoryImpl extends BaseRepositoryImpl<Employee, Integer> implements 
EmployeeRepository{

	

	
	
	public EmployeeRepositoryImpl(EntityManager em)
	{
		super(Employee.class, em);
	}

	/*
	 * @Override public List<Employee> findByCommentEndsWith(String x) { // TODO
	 * Auto-generated method stub return null; }
	 */

	@Override
	public List<Employee> findEmployeeById(Integer id) {
		String hql = "SELECT e FROM Employee e WHERE e.id = :id";
        TypedQuery<Employee> query = em.createQuery(hql, Employee.class);
        query.setParameter("id", id);
        return query.getResultList();
       
	}
	
	@Override
	public Page<Employee> findEmployee(Pageable pageable)
	{
	
		Query selectQuery = em.createNativeQuery("Select * from Employee");
		selectQuery.setFirstResult((pageable.getPageNumber() -1) * pageable.getPageSize());
		selectQuery.setMaxResults(pageable.getPageSize());
		List res1 = selectQuery.getResultList();
		Page<Employee> page = new PageImpl<>(res1, pageable, res1.size());
		return page;
	}

	@Override
	public List<Employee> findEmployee1(Pageable pageable) {
		
		String sql = "SELECT * FROM Employee";
		Query selectQuery = em.createNativeQuery(sql);
		selectQuery.setMaxResults(pageable.getPageSize());
		selectQuery.setFirstResult(pageable.getPageNumber() * pageable.getPageSize());
		List result = selectQuery.getResultList();
		return result;
	}

	/*
	 * @Override public List<Employee> useTheRepo(Integer id) { // TODO
	 * Auto-generated method stub return null; }
	 */
	
	
	
	
	

}
