package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.MerchantEntity;


public interface MerchantRepo extends JpaRepository<MerchantEntity, Integer> {

}
