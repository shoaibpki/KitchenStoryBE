package com.ks.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ks.entities.Menu;
import com.ks.entities.MenuItems;
import com.ks.model.MenuModel;
import com.ks.repositories.MenuItemRepository;
import com.ks.repositories.MenuRepository;

@Service
@Transactional
public class MenuItemsServiceImp implements MenuItemsService {
	
	@Autowired
	MenuItemRepository menuItemRepository;
	
	@Autowired
	MenuRepository menuRepository;


	@Override
	public void deleteMenuItem(Long id) {
		menuItemRepository.deleteById(id);
	}

	@Override
	public List<MenuItems> getMenuItems() {
		List<MenuItems> foodItems = menuItemRepository.findAll();
		return foodItems ;
	}

	@Override
	public void saveMenu(Menu menu) {
		Menu m = new Menu();
		m.setMenuName(menu.getMenuName());
		m.setDisabled(menu.isDisabled());
		menuRepository.save(menu);
	}

	@Override
	public void saveMenuItem(MenuModel menuModel) {
		Menu lmenu = menuRepository.findById(menuModel.getMenuId())
				.orElseThrow(() -> new RuntimeException("Menu not found!"));
		MenuItems mi = new MenuItems();
		mi.setItemName(menuModel.getItemName());
		mi.setPrice(menuModel.getPrice());
		mi.setDisabled(menuModel.isDisabled());
		mi.setMenu(lmenu);
		menuItemRepository.save(mi);
	}

	@Override
	public List<Menu> getMenuAll() {
		return menuRepository.findAll();
	}

	@Override
	public List<MenuItems> getItemsByMenu(Long mid) {
		List<MenuItems> mi = menuItemRepository.findByMenuId(mid);
		return mi;
		
	}


}
