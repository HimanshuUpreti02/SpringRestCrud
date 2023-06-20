package com.example.RestCrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.RestCrud.entity.User;

/**
 * UserRepository
 */
public interface UserRepository extends CrudRepository<User , Integer>{

    
}
