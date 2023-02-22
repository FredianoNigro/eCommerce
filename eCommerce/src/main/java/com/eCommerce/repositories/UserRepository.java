package com.eCommerce.repositories;

import org.springframework.data.repository.CrudRepository;

import com.eCommerce.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
