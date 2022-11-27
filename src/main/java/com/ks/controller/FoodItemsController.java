package com.ks.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ks.entities.Menu;
import com.ks.entities.MenuItems;
import com.ks.model.MenuModel;
import com.ks.services.MenuItemsService;

@RestController
public class FoodItemsController {
	
	@Autowired
	MenuItemsService menuItemsService;
	
	@PostMapping("menuitem/add")
	ResponseEntity<String> addMenuItem(@RequestBody MenuModel menuModel){
		menuItemsService.saveMenuItem(menuModel);
		return new ResponseEntity<String>("add successfully", HttpStatus.OK);
	}
	
	@PostMapping("menu/add")
	ResponseEntity<String> addMenu(@RequestBody Menu menu){
		menuItemsService.saveMenu(menu);
		return new ResponseEntity<String>("add successfully", HttpStatus.OK);
	}
	
	@GetMapping("menu/list")
	List<Menu> getMenu(){
		return menuItemsService.getMenuAll();
	}
}
