package com.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entities.Product;
import com.springboot.repo.ProductRepo;

@Service
public class ProductServices {
	@Autowired
	private ProductRepo repo;

	public Product addProduct(Product p) {
		if (repo.existsById(p.getpId())) {
			repo.save(p);
		}
		return p;
	}
	
	//TODO 
}
