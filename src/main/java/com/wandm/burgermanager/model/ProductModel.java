package com.wandm.burgermanager.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long id_burger;
    private String name_burger;
    private Long id_ingredient;
    private Long ingredient_quantity;

    public ProductModel() {
    }

    public ProductModel(Long id_burger, String name_burger, Long id_ingredient, Long ingredient_quantity) {
        this.id_burger = id_burger;
        this.name_burger = name_burger;
        this.id_ingredient = id_ingredient;
        this.ingredient_quantity = ingredient_quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_burger() {
        return id_burger;
    }

    public void setId_burger(Long id_burger) {
        this.id_burger = id_burger;
    }

    public String getName_burger() {
        return name_burger;
    }

    public void setName_burger(String name_burger) {
        this.name_burger = name_burger;
    }

    public Long getId_ingredient() {
        return id_ingredient;
    }

    public void setId_ingredient(Long id_ingredient) {
        this.id_ingredient = id_ingredient;
    }

    public Long getIngredient_quantity() {
        return ingredient_quantity;
    }

    public void setIngredient_quantity(Long ingredient_quantity) {
        this.ingredient_quantity = ingredient_quantity;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "id=" + id +
                ", id_burger=" + id_burger +
                ", name_burger='" + name_burger + '\'' +
                ", id_ingredient=" + id_ingredient +
                ", ingredient_quantity=" + ingredient_quantity +
                '}';
    }
}
