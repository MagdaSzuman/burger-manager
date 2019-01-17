package com.wandm.burgermanager.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class IngredientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nameIngredient")
    private String nameIngredient;
    @ManyToOne
    @JoinColumn(name = "id_ingredient")
    @JsonIgnore
    private SupplierModel id_supplier;
    private Integer stockIngredient;
    private long best_of_ingredient;
    private Integer portion_of_ingredient;
    private Integer idType;

    public IngredientModel() {
    }

    public IngredientModel(String nameIngredient, SupplierModel id_supplier, Integer stockIngredient, long best_of_ingredient, Integer portion_of_ingredient) {
        this.nameIngredient = nameIngredient;
        this.id_supplier = id_supplier;
        this.stockIngredient = stockIngredient;
        this.best_of_ingredient = best_of_ingredient;
        this.portion_of_ingredient = portion_of_ingredient;
    }

    public IngredientModel(String nameIngredient, SupplierModel id_supplier, Integer stockIngredient, long best_of_ingredient, Integer portion_of_ingredient, Integer idType) {
        this.nameIngredient = nameIngredient;
        this.id_supplier = id_supplier;
        this.stockIngredient = stockIngredient;
        this.best_of_ingredient = best_of_ingredient;
        this.portion_of_ingredient = portion_of_ingredient;
        this.idType = idType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameIngredient() {
        return nameIngredient;
    }

    public void setNameIngredient(String nameIngredient) {
        this.nameIngredient = nameIngredient;
    }

    public SupplierModel getId_supplier() {
        return id_supplier;
    }

    public void setId_supplier(SupplierModel id_supplier) {
        this.id_supplier = id_supplier;
    }

    public Integer getStockIngredient() {
        return stockIngredient;
    }

    public void setStockIngredient(Integer stockIngredient) {
        this.stockIngredient = stockIngredient;
    }

    public long getBest_of_ingredient() {
        return best_of_ingredient;
    }

    public void setBest_of_ingredient(long best_of_ingredient) {
        this.best_of_ingredient = best_of_ingredient;
    }

    public Integer getPortion_of_ingredient() {
        return portion_of_ingredient;
    }

    public void setPortion_of_ingredient(Integer portion_of_ingredient) {
        this.portion_of_ingredient = portion_of_ingredient;
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    @Override
    public String toString() {
        return "IngredientModel{" +
                "id=" + id +
                ", nameIngredient='" + nameIngredient + '\'' +
                ", id_supplier=" + id_supplier +
                ", stockIngredient=" + stockIngredient +
                ", best_of_ingredient=" + best_of_ingredient +
                ", portion_of_ingredient=" + portion_of_ingredient +
                ", idType=" + idType +
                '}';
    }
}