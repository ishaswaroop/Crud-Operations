package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.CategoryEntity;
import com.example.demo.entity.Product;
import com.example.demo.repo.CategoryRepo;
import com.example.demo.repo.CustomerRepo;
import com.example.demo.repo.MerchantRepo;
import com.example.demo.repo.ProductRepo;


@RestController
@RequestMapping("/category")
public class CategoryController {

	
	public CategoryController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	CategoryRepo  catRepo;
	
	@GetMapping("/")
	public List<CategoryEntity> getCat()
	{
		return catRepo.findAll();
	}
	
	@PostMapping("/")
	public List<CategoryEntity> saveCat(@RequestBody CategoryEntity cat)
	{
		catRepo.save(cat);
		return catRepo.findAll();
	}
	
	@PutMapping("/")
	public List<CategoryEntity> updateCat(@RequestBody CategoryEntity cat)
	{
		catRepo.save(cat);
		return catRepo.findAll();
	}
	
	@DeleteMapping("/{cid}")
	public List<CategoryEntity> deleteCat(@PathVariable("cid") int id)
	{
		catRepo.deleteById(id);
		return catRepo.findAll();
	}
	

	
}