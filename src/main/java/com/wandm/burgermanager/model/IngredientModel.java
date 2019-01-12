package com.wandm.burgermanager.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class IngredientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name_ingredient;
    @ManyToOne
    @JoinColumn(name = "id_ingredient")
    private SupplierModel id_supplier;
    private Integer stock_ingredient;
    private long best_of_ingredient;
    private Integer portion_of_ingredient;

    public IngredientModel() {
    }

    public IngredientModel(String name_ingredient, SupplierModel id_supplier, Integer stock_ingredient, long best_of_ingredient, Integer portion_of_ingredient) {
        this.name_ingredient = name_ingredient;
        this.id_supplier = id_supplier;
        this.stock_ingredient = stock_ingredient;
        this.best_of_ingredient = best_of_ingredient;
        this.portion_of_ingredient = portion_of_ingredient;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName_ingredient() {
        return name_ingredient;
    }

    public void setName_ingredient(String name_ingredient) {
        this.name_ingredient = name_ingredient;
    }

    public SupplierModel getId_supplier() {
        return id_supplier;
    }

    public void setId_supplier(SupplierModel id_supplier) {
        this.id_supplier = id_supplier;
    }

    public Integer getStock_ingredient() {
        return stock_ingredient;
    }

    public void setStock_ingredient(Integer stock_ingredient) {
        this.stock_ingredient = stock_ingredient;
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

    @Override
    public String toString() {
        return "IngredientModel{" +
                "id=" + id +
                ", name_ingredient='" + name_ingredient + '\'' +
                ", id_supplier=" + id_supplier +
                ", stock_ingredient=" + stock_ingredient +
                ", best_of_ingredient=" + best_of_ingredient +
                ", portion_of_ingredient=" + portion_of_ingredient +
                '}';
    }
}