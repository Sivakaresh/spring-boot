package com.sgic.start.service;

import java.util.List;

import com.sgic.start.criteria.UserCriteria;
import com.sgic.start.entity.User;

public interface UserService {

	public List<User> search(UserCriteria userCriteria);
	
	public List<User> findByFirstName(String name);
}
