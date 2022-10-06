package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
     @Autowired
     private EmployeeRepository employeerepository;
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeerepository.findAll();
	}
	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		this.employeerepository.save(employee);
		
	}
	@Override
	public Employee getEmployeeById(long id) {
    Optional<Employee>optional=employeerepository.findById(id);
    Employee employee=null;
    if(optional.isPresent()) {
    	employee=optional.get();
    }else {
    	throw new RuntimeException("Employee Not Found for id ::"+id);
    }
    
    return employee;
	}
	@Override
	public void deleteEmployeeById(long id) {
		// TODO Auto-generated method stub
		 this.employeerepository.deleteById(id);
		
	}
	
    
	
	

}
