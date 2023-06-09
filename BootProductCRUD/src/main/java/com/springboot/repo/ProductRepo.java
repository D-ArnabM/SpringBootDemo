package com.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot.entities.Product;

public interface ProductRepo extends JpaRepository<Product,Integer>{
	
	@Query("from Product p where p.pName = :name")
	public Product findProductByName(@Param("name") String name);
}

