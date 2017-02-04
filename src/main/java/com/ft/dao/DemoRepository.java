package com.ft.dao;

import org.springframework.data.repository.CrudRepository;

import com.ft.entity.User;

public interface DemoRepository extends CrudRepository<User, Integer> {

}
