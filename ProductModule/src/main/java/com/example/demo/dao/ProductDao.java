package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Product;

public interface ProductDao extends JpaRepository<Product,Long >{
	
	
	//public List<Product> findByProductPrice(int ProdPrice);

}
