package com.ks.services;

import java.util.List;

import com.ks.entities.Menu;
import com.ks.entities.MenuItems;
import com.ks.model.MenuModel;

public interface MenuItemsService {
	
	List<MenuItems> getMenuItems();
	void saveMenuItem(MenuModel menuModel);
	void deleteMenuItem(Long id);

	void saveMenu(Menu menu);
	List<Menu> getMenuAll();

}
