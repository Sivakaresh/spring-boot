package com.sgic.start.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.start.entity.Kitty;
import com.sgic.start.entity.Wolf;
import com.sgic.start.repository.WelcomeRepository;
import com.sgic.start.repository.WelcomeWolfRepository;

@Service
public class WelcomeServiceImpl implements WelcomeService {

	@Autowired
	WelcomeRepository welcomeReposiroty;
	
	@Autowired
	WelcomeWolfRepository welcomeWolfRepository;
	
	@Override
	public List<Kitty> getAllKitty() {
		// TODO Auto-generated method stub
		return welcomeReposiroty.findAll();
	}

	@Override
	public List<Wolf> getAllWolf() {
		// TODO Auto-generated method stub
		return welcomeWolfRepository.findAll();
	}

	@Override
	public boolean addKitty(Kitty kitty) {
		// TODO Auto-generated method stub
		
		 welcomeReposiroty.save(kitty);
		 return true;
	}

	@Override
	public boolean updateKitty(Kitty kitty,Integer id) {
		// TODO Auto-generated method stub
//		Integer id = kitty.getId();
//		Kitty kitty2 = welcomeReposiroty.getOne(id);
//		
//		if(kitty.getId() == kitty2.getId() ) {
//			kitty2.setFav(kitty.getFav());
//			kitty2.setName(kitty.getName());
//			welcomeReposiroty.save(kitty2);
//		}
//		
//		return true;
		
		if(welcomeReposiroty.getOne(id) != null) {
			welcomeReposiroty.save(kitty);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteKitty(Integer kittyId) {
		// TODO Auto-generated method 
		
		if(kittyId == welcomeReposiroty.getOne(kittyId).getId()) {
		welcomeReposiroty.deleteById(kittyId);
		return true;
		}
		return false;
	}



	@Override
	public Kitty viewKittyByID(Integer id) {
		// TODO Auto-generated method stub
		return welcomeReposiroty.getOne(id);
		
	}








	
	
}
