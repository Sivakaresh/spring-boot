package com.sgic.start.service;

import java.util.List;

import com.sgic.start.entity.Kitty;
import com.sgic.start.entity.Wolf;

public interface WelcomeService {

	List<Kitty> getAllKitty();
	
	List<Wolf> getAllWolf();
	
	Kitty viewKittyByID(Integer id);

	boolean addKitty(Kitty kitty);
	
	boolean updateKitty(Kitty kitty, Integer id);
	
	boolean deleteKitty(Integer kittyId);

}
