package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CustomerEntity;
import com.example.demo.repo.CustomerRepo;


@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerRepo  custRepo;
	
	@GetMapping("/")
	public List<CustomerEntity> getCust()
	{
		return custRepo.findAll();
	}
	
	@PostMapping("/")
	public List<CustomerEntity> saveCust(@RequestBody CustomerEntity cust)
	{
		custRepo.save(cust);
		return custRepo.findAll();
	}
	
	@PutMapping("/")
	public List<CustomerEntity> updateCust(@RequestBody CustomerEntity cust)
	{
		custRepo.save(cust);
		return custRepo.findAll();
	}
	
	@DeleteMapping("/{custid}")
	public List<CustomerEntity> deleteCust(@PathVariable("custid") int id)
	{
		custRepo.deleteById(id);
		return custRepo.findAll();
	}
	
}