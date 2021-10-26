package com.himanshu.SpringCRUDByMe.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.himanshu.SpringCRUDByMe.model.Employee;



public interface EmployeeRespository extends JpaRepository<Employee, Long>{
	
	
	//All CRUD Database methods

}
