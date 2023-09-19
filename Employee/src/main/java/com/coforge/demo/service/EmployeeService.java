package com.coforge.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.demo.dao.EmployeeRepo;
import com.coforge.demo.model.Employee;

@Service
public class EmployeeService {
 
	@Autowired
	private EmployeeRepo repo;
	
	public List<Employee> getEmpDetails(){
		return repo.findAll();
	}
	
	public Employee getEmpDetailsById(int id){
		 return repo.findById(id).orElseThrow();
	}
	
}
