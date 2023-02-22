package com.eCommerce.repositories;

import org.springframework.data.repository.CrudRepository;

import com.eCommerce.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Integer> {

}
