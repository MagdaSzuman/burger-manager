package com.wandm.burgermanager.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class IngredientModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIgredient;
    private String nameIgredient;
    private Long quantityIgredient;

    public IngredientModel() {
    }

    public IngredientModel(String nameIgredient, Long quantityIgredient) {
        this.nameIgredient = nameIgredient;
        this.quantityIgredient = quantityIgredient;
    }

    public Long getIdIgredient() {
        return idIgredient;
    }

    public void setIdIgredient(Long idIgredient) {
        this.idIgredient = idIgredient;
    }

    public String getNameIgredient() {
        return nameIgredient;
    }

    public void setNameIgredient(String nameIgredient) {
        this.nameIgredient = nameIgredient;
    }

    public Long getQuantityIgredient() {
        return quantityIgredient;
    }

    public void setQuantityIgredient(Long quantityIgredient) {
        this.quantityIgredient = quantityIgredient;
    }

    @Override
    public String toString() {
        return "IngredientModel{" +
                "idIgredient=" + idIgredient +
                ", nameIgredient='" + nameIgredient + '\'' +
                ", quantityIgredient=" + quantityIgredient +
                '}';
    }
}
