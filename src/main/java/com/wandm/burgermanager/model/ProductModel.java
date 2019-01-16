package com.wandm.burgermanager.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nameBurger")
    private String nameBurger;

    @OneToMany(cascade = CascadeType.ALL)
    private List<TypeModel> listofTypes = new ArrayList<>();

    public ProductModel() {
    }

    public ProductModel(String nameBurger) {
        this.nameBurger = nameBurger;
    }

    public ProductModel(String nameBurger, List<TypeModel> listofTypes) {
        this.nameBurger = nameBurger;
        this.listofTypes = listofTypes;
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


    public List<TypeModel> getListofTypes() {
        return listofTypes;
    }

    public void setListofTypes(List<TypeModel> listofTypes) {
        this.listofTypes = listofTypes;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "id=" + id +
                ", nameBurger='" + nameBurger + '\'' +
                ", listofTypes=" + listofTypes +
                '}';
    }
}
