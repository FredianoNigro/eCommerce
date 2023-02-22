package com.eCommerce.repositories;

import org.springframework.data.repository.CrudRepository;

import com.eCommerce.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
	
}
