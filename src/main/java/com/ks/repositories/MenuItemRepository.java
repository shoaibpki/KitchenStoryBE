package com.ks.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ks.entities.MenuItems;

public interface MenuItemRepository extends JpaRepository<MenuItems, Long> {
	
	List<MenuItems> findByMenuId(Long fid);

}
