package com.wandm.burgermanager.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name_burger")
    private String nameBurger;

    @OneToMany (mappedBy = "idType", cascade = CascadeType.ALL)
    public List<Integer> listOfIngredients = new ArrayList<>();

    public ProductModel(String classic) {
    }

    public ProductModel(String nameBurger, List<Integer> listOfIngredients) {
        this.nameBurger = nameBurger;
        this.listOfIngredients = listOfIngredients;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameBurger() {
        return nameBurger;
    }

    public void setNameBurger(String nameBurger) {
        this.nameBurger = nameBurger;
    }



    @Override
    public String toString() {
        return "ProductModel{" +
                "id=" + id +
                ", nameBurger='" + nameBurger + '\'' +
                ", listOfIngredients=" + listOfIngredients +
                '}';
    }
}