package com.datajpapractice.page.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.datajpapractice.page.Entity.Employee;
import com.datajpapractice.page.exception.DbResultNotFoundException;

@NoRepositoryBean         //--Disable the automatic method implementation feature
public interface BaseRepository<T,ID> extends JpaRepository<T, ID> {
	
	T findByIDMandatory(ID id) throws DbResultNotFoundException;
	
	void clear();
	void detach(T entity);



}
