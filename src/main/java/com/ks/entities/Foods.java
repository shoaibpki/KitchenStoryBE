package com.ks.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Foods {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String foodName;

    @OneToMany(mappedBy = "foods", cascade = CascadeType.ALL)
    private List<FoodItems> foodItems = new ArrayList<>();
}
