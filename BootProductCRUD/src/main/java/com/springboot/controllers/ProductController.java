package com.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@PostMapping("/addMultipleProducts")
	public List<Product> addMultipleProducts(@RequestBody List<Product> produts){
		return service.addAllProducts(produts);
	}
	
	@PostMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}
	
	@GetMapping("/getProductById/{id}")
	public Product getProductById(@PathVariable("id") int id) {
		return service.findProductById(id);
	}
	
	@GetMapping("/getProductByName/{name}")
	public Product getProductByName(@PathVariable("name") String name) {
		return service.findProductByName(name);
	}
	
	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts(){
		return service.getAllProducts();
	}
	
	@DeleteMapping("/deleteProductById/{id}")
	public String deleteProductById(@PathVariable("id") int id) {
		return service.deleteProduct(id);
	}
	
	@DeleteMapping("/deleteAllProductsFromTable")
	public String deleteAllProductsFromTable() {
		return service.clearProductTable();
	}
}
