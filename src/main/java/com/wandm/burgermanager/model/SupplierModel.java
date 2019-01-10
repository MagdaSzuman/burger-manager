package com.wandm.burgermanager.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class SupplierModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_supplier;
    private String name_supplier;
    private String address_supplier;
    @OneToMany(mappedBy = "id_supplier", cascade=CascadeType.ALL)
    private List<IngredientModel> id_ingredient= new ArrayList<>();

    public SupplierModel() {
    }

    public SupplierModel(String name_supplier, String address_supplier, List<IngredientModel> id_ingredient) {
        this.name_supplier = name_supplier;
        this.address_supplier = address_supplier;
        this.id_ingredient = id_ingredient;
    }

    public Long getId_supplier() {
        return id_supplier;
    }

    public void setId_supplier(Long id_supplier) {
        this.id_supplier = id_supplier;
    }

    public String getName_supplier() {
        return name_supplier;
    }

    public void setName_supplier(String name_supplier) {
        this.name_supplier = name_supplier;
    }

    public String getAddress_supplier() {
        return address_supplier;
    }

    public void setAddress_supplier(String address_supplier) {
        this.address_supplier = address_supplier;
    }

    public List<IngredientModel> getId_ingredient() {
        return id_ingredient;
    }

    public void setId_ingredient(List<IngredientModel> id_ingredient) {
        this.id_ingredient = id_ingredient;
    }

    @Override
    public String toString() {
        return "SupplierModel{" +
                "id_supplier=" + id_supplier +
                ", name_supplier='" + name_supplier + '\'' +
                ", address_supplier='" + address_supplier + '\'' +
                ", id_ingredient=" + id_ingredient +
                '}';
    }
}

