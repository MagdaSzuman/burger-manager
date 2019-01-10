package com.wandm.burgermanager.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class BurgerModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idBurger;
    private String nameBurger;
    private Long idIngredient;
    private Long quantityIngredientNeeded;

    public BurgerModel(Long idBurger, String nameBurger, Long idIngredient, Long quantityIngredientNeeded) {
        this.idBurger = idBurger;
        this.nameBurger = nameBurger;
        this.idIngredient = idIngredient;
        this.quantityIngredientNeeded = quantityIngredientNeeded;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdBurger() {
        return idBurger;
    }

    public void setIdBurger(Long idBurger) {
        this.idBurger = idBurger;
    }

    public String getNameBurger() {
        return nameBurger;
    }

    public void setNameBurger(String nameBurger) {
        this.nameBurger = nameBurger;
    }

    public Long getIdIngredient() {
        return idIngredient;
    }

    public void setIdIngredient(Long idIngredient) {
        this.idIngredient = idIngredient;
    }

    public Long getQuantityIngredientNeeded() {
        return quantityIngredientNeeded;
    }

    public void setQuantityIngredientNeeded(Long quantityIngredientNeeded) {
        this.quantityIngredientNeeded = quantityIngredientNeeded;
    }

    @Override
    public String toString() {
        return "BurgerModel{" +
                "id=" + id +
                ", idBurger=" + idBurger +
                ", nameBurger='" + nameBurger + '\'' +
                ", idIngredient=" + idIngredient +
                ", quantityIngredientNeeded=" + quantityIngredientNeeded +
                '}';
    }
}
