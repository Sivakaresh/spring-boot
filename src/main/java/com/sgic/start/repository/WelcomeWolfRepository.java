package com.sgic.start.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.start.entity.Wolf;

public interface WelcomeWolfRepository extends JpaRepository<Wolf, Integer> {

}
