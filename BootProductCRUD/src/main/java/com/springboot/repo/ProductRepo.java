package com.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.entities.Product;

public interface ProductRepo extends JpaRepository<Product,Integer>{

}

