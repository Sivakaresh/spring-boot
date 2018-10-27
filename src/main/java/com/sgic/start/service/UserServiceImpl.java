package com.sgic.start.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.querydsl.core.BooleanBuilder;
import com.sgic.start.criteria.UserCriteria;
import com.sgic.start.entity.QUser;
import com.sgic.start.entity.User;
import com.sgic.start.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> search(UserCriteria userCriteria) {
		// TODO Auto-generated method stub
		List<User> userList = new ArrayList<>();
		
		BooleanBuilder booleanBuilder = new BooleanBuilder();
		
		if(userCriteria.getStatusName() != null) {
			booleanBuilder.and(QUser.user.leave.any().status().statusName.eq(userCriteria.getStatusName()));
		}
		
		if(booleanBuilder.hasValue()) {
			userRepository.findAll(booleanBuilder).forEach(userList::add);
		}
		else {
			userList = userRepository.findAll();
		}
		return userList;
	}

	@Override
	public List<User> findByFirstName(String name) {
		// TODO Auto-generated method stub
		return userRepository.findByFirstName(name);
	}

	
}
