package com.wandm.burgermanager.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class SupplierModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSupplier;
    private String nameSupplier;
    private String addressSupplier;
    private Long idIngredient;

    public SupplierModel(String nameSupplier, String addressSupplier, Long idIngredient) {
        this.nameSupplier = nameSupplier;
        this.addressSupplier = addressSupplier;
        this.idIngredient = idIngredient;
    }

    public Long getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(Long idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getNameSupplier() {
        return nameSupplier;
    }

    public void setNameSupplier(String nameSupplier) {
        this.nameSupplier = nameSupplier;
    }

    public String getAddressSupplier() {
        return addressSupplier;
    }

    public void setAddressSupplier(String addressSupplier) {
        this.addressSupplier = addressSupplier;
    }

    public Long getIdIngredient() {
        return idIngredient;
    }

    public void setIdIngredient(Long idIngredient) {
        this.idIngredient = idIngredient;
    }

    @Override
    public String toString() {
        return "SupplierModel{" +
                "idSupplier=" + idSupplier +
                ", nameSupplier='" + nameSupplier + '\'' +
                ", addressSupplier='" + addressSupplier + '\'' +
                ", idIngredient=" + idIngredient +
                '}';
    }
}
