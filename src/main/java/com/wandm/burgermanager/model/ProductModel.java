package com.wandm.burgermanager.model;

import javax.persistence.*;

@Entity
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nameBurger")
    private String nameBurger;

    public ProductModel() {
    }

    public ProductModel(String nameBurger) {
        this.nameBurger = nameBurger;
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
                '}';
    }
}
