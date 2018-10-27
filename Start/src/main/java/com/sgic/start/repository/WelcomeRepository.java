package com.sgic.start.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.start.entity.Kitty;

public interface WelcomeRepository extends JpaRepository<Kitty, Integer>{

}
