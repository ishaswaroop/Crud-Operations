package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CategoryEntity;


public interface CategoryRepo extends JpaRepository<CategoryEntity, Integer> {

}


