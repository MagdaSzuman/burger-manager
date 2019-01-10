package com.wandm.burgermanager.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class IngredientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long id_ingredient;
    private String name_ingredient;
    private Long id_supplier;
    private Long stock_ingredient;
    private Date best_of_ingredient;

    public IngredientModel() {
    }

    public IngredientModel(Long id_ingredient, String name_ingredient, Long id_supplier, Long stock_ingredient, Date best_of_ingredient) {
        this.id_ingredient = id_ingredient;
        this.name_ingredient = name_ingredient;
        this.id_supplier = id_supplier;
        this.stock_ingredient = stock_ingredient;
        this.best_of_ingredient = best_of_ingredient;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_ingredient() {
        return id_ingredient;
    }

    public void setId_ingredient(Long id_ingredient) {
        this.id_ingredient = id_ingredient;
    }

    public String getName_ingredient() {
        return name_ingredient;
    }

    public void setName_ingredient(String name_ingredient) {
        this.name_ingredient = name_ingredient;
    }

    public Long getId_supplier() {
        return id_supplier;
    }

    public void setId_supplier(Long id_supplier) {
        this.id_supplier = id_supplier;
    }

    public Long getStock_ingredient() {
        return stock_ingredient;
    }

    public void setStock_ingredient(Long stock_ingredient) {
        this.stock_ingredient = stock_ingredient;
    }

    public Date getBest_of_ingredient() {
        return best_of_ingredient;
    }

    public void setBest_of_ingredient(Date best_of_ingredient) {
        this.best_of_ingredient = best_of_ingredient;
    }

    @Override
    public String toString() {
        return "IngredientModel{" +
                "id=" + id +
                ", id_ingredient=" + id_ingredient +
                ", name_ingredient='" + name_ingredient + '\'' +
                ", id_supplier=" + id_supplier +
                ", stock_ingredient=" + stock_ingredient +
                ", best_of_ingredient=" + best_of_ingredient +
                '}';
    }
}
