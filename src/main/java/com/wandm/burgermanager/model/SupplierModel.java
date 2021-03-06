package com.wandm.burgermanager.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class SupplierModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_supplier;
    @Column(name = "nameSupplier")
    private String nameSupplier;
    private String address_supplier;
    @OneToMany(mappedBy = "id_supplier", cascade = CascadeType.ALL)
    private List<IngredientModel> id_ingredient = new ArrayList<>();

    public SupplierModel() {
    }

    public SupplierModel(String nameSupplier, String address_supplier) {
        this.nameSupplier = nameSupplier;
        this.address_supplier = address_supplier;
    }

    public SupplierModel(String nameSupplier, String address_supplier, List<IngredientModel> id_ingredient) {
        this.nameSupplier = nameSupplier;
        this.address_supplier = address_supplier;
        this.id_ingredient = getId_ingredient();
    }

    public Integer getId_supplier() {
        return id_supplier;
    }

    public void setId_supplier(Integer id_supplier) {
        this.id_supplier = id_supplier;
    }

    public String getNameSupplier() {
        return nameSupplier;
    }

    public void setNameSupplier(String nameSupplier) {
        this.nameSupplier = nameSupplier;
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
                ", nameSupplier='" + nameSupplier + '\'' +
                ", address_supplier='" + address_supplier + '\'' +
                ", id_ingredient=" + getId_ingredient() +
                '}';
    }
}
