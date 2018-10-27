package com.sgic.start.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.start.entity.Kitty;
import com.sgic.start.entity.Wolf;
import com.sgic.start.service.WelcomeService;

@RestController
public class WelcomeController {
	
	@Autowired
	WelcomeService welcomeService;
	

	@GetMapping("/role")
	public List<Kitty> viewRoles() {
		return welcomeService.getAllKitty();
	}
	
	@GetMapping("/roleid/{id}")
	public Kitty viewRoleById(@PathVariable Integer id){
		return welcomeService.viewKittyByID(id);
	}
	
	
	@GetMapping("/wolf")
	public List<Wolf> viewWolf(){
		return welcomeService.getAllWolf();
	}
	
	@PostMapping("/saverole")
	public boolean addRoles(@RequestBody Kitty kitty){
		 welcomeService.addKitty(kitty);
		return true;
	}
	
	@PutMapping("/updaterole/{id}")
	public boolean updateRoles(@RequestBody Kitty kitty, @PathVariable("id") Integer kittyId ) {
		welcomeService.updateKitty(kitty,kittyId);
		return true;
	}
	
	@DeleteMapping("/deleterole/{id}")
	public boolean deleteKitty(@PathVariable("id") Integer kittyId) {
		welcomeService.deleteKitty(kittyId);
		return true;
	}
}
