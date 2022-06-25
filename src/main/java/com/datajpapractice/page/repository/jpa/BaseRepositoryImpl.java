package com.datajpapractice.page.repository.jpa;

import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;


import com.datajpapractice.page.exception.DbResultNotFoundException;
import com.datajpapractice.page.repository.BaseRepository;


public abstract class BaseRepositoryImpl<T,ID> extends SimpleJpaRepository<T, ID>
										implements BaseRepository<T,ID>  {
	
	//protected final QEmployee employee = QEmployee.employee;
	protected final EntityManager em;
	
	public BaseRepositoryImpl(Class<T> domainClass,EntityManager em)
	{
		super(domainClass,em);
		this.em=em;
	}
	
	@Override
	public T findByIDMandatory(ID id) throws DbResultNotFoundException{
		return findById(id)
				.orElseThrow(()->new DbResultNotFoundException("Entity Not Found with id"+id)
				);
	}
	
	
	public void clear()
	{
		em.clear();
	}
	public void detach(T entity)
	{
		em.detach(entity);
	}
	

}
