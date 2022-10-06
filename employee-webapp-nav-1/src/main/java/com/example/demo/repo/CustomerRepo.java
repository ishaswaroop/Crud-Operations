package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CustomerEntity;


public interface CustomerRepo extends JpaRepository<CustomerEntity, Integer> {

}
