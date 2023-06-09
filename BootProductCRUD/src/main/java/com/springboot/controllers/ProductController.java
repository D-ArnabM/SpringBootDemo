package com.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entities.Product;
import com.springboot.services.ProductServices;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/ProductCRUD")
@Tag(name="Product CRUD Demo")
public class ProductController {
	
	@Autowired
	private ProductServices service;
	
	@PostMapping("/addSingleProduct")
	public Product addSingleProduct(@RequestBody Product p) {
		return service.addProduct(p);
	}
}
