package com.wandm.burgermanager.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class IngredientModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idIngredient;
    private String nameIngredient;
    private Long quantityIngredientAvailable;
    private Long idSupplier;

    public IngredientModel(Long idIngredient, String nameIngredient, Long quantityIngredientAvailable, Long idSupplier) {
        this.idIngredient = idIngredient;
        this.nameIngredient = nameIngredient;
        this.quantityIngredientAvailable = quantityIngredientAvailable;
        this.idSupplier = idSupplier;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdIngredient() {
        return idIngredient;
    }

    public void setIdIngredient(Long idIngredient) {
        this.idIngredient = idIngredient;
    }

    public String getNameIngredient() {
        return nameIngredient;
    }

    public void setNameIngredient(String nameIngredient) {
        this.nameIngredient = nameIngredient;
    }

    public Long getQuantityIngredientAvailable() {
        return quantityIngredientAvailable;
    }

    public void setQuantityIngredientAvailable(Long quantityIngredientAvailable) {
        this.quantityIngredientAvailable = quantityIngredientAvailable;
    }

    public Long getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(Long idSupplier) {
        this.idSupplier = idSupplier;
    }

    @Override
    public String toString() {
        return "IngredientModel{" +
                "id=" + id +
                ", idIngredient=" + idIngredient +
                ", nameIngredient='" + nameIngredient + '\'' +
                ", quantityIngredientAvailable=" + quantityIngredientAvailable +
                ", idSupplier=" + idSupplier +
                '}';
    }
}
