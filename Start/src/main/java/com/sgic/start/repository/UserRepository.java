package com.sgic.start.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.sgic.start.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>, QuerydslPredicateExecutor<User> {

	@Query("select * from user")
	public List<User> getUser();
	
	public List<User> findByFirstName(String name);
}
