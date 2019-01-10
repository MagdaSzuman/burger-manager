package com.wandm.burgermanager.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SupplierModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_supplier;
    private String name_supplier;
    private String address_supplier;

    public SupplierModel() {
    }

    public SupplierModel(String name_supplier, String address_supplier) {
        this.name_supplier = name_supplier;
        this.address_supplier = address_supplier;
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

    @Override
    public String toString() {
        return "SupplierModel{" +
                "id_supplier=" + id_supplier +
                ", name_supplier='" + name_supplier + '\'' +
                ", address_supplier='" + address_supplier + '\'' +
                '}';
    }
}
