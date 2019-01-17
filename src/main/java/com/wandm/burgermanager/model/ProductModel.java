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

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<TypeModel> listOfTypes = new ArrayList<>();

    public ProductModel() {
    }

    public ProductModel(String nameBurger) {
        this.nameBurger = nameBurger;
    }

    public ProductModel(String nameBurger, List<TypeModel> listofTypes) {
        this.nameBurger = nameBurger;
        this.listOfTypes = listofTypes;
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


    public List<TypeModel> getListOfTypes() {
        return listOfTypes;
    }

    public void setListOfTypes(List<TypeModel> listOfTypes) {
        this.listOfTypes = listOfTypes;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "id=" + id +
                ", nameBurger='" + nameBurger + '\'' +
                ", listofTypes=" + listOfTypes +
                '}';
    }
}
