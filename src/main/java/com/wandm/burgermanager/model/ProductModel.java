package com.wandm.burgermanager.model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name_burger;

    public ProductModel() {
    }

    public ProductModel(String name_burger) {
        this.name_burger = name_burger;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName_burger() {
        return name_burger;
    }

    public void setName_burger(String name_burger) {
        this.name_burger = name_burger;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "id=" + id +
                ", name_burger='" + name_burger + '\'' +
                '}';
    }
}