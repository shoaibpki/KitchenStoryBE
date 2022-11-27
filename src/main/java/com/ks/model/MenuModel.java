package com.ks.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MenuModel {

    private String itemName;
    private boolean disabled;
    private double price;
    private Long menuId;

}
