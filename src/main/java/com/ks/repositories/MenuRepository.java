package com.ks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ks.entities.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long> {

}
