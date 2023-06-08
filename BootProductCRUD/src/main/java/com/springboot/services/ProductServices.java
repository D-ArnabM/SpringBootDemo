package com.springboot.services;

import java.util.List;

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
			return repo.save(p);
		}
		return null;
	}

	public List<Product> addAllProducts(List<Product> products) {
		return repo.saveAll(products);
	}

	public Product updateProduct(Product product) {
		if (repo.findById(product.getpId()).get() != null) {
			Product existingProduct = repo.findById(product.getpId()).get();
			existingProduct.setpName(product.getpName());
			existingProduct.setpQuantity(product.getpQuantity());
			existingProduct.setpPrice(product.getpPrice());
			return product;
		}
		return null;
	}

	public Product findProductById(int id) {
		if (repo.findById(id).get() != null) {
			return repo.findById(id).get();
		}
		return null;
	}
	
	public Product findProductByName(String name) {
		if(repo.findProductByName(name)!=null) {
			return repo.findProductByName(name);
		}
		return null;
	}
	
	public List<Product> getAllProducts(){
		return repo.findAll();
	}
	
	
}
