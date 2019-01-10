package com.wandm.burgermanager.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class IngredientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany (mappedBy = "ingredients")
    private Set<ProductModel> products= new HashSet<>();
    private String name_ingredient;
    @ManyToOne
    @JoinColumn(name = "id_ingredient")
    private SupplierModel id_supplier;
    private Long stock_ingredient;
    private Date best_of_ingredient;

    public IngredientModel() {
    }

    public IngredientModel(Set<ProductModel> products, String name_ingredient, SupplierModel id_supplier, Long stock_ingredient, Date best_of_ingredient) {
        this.products = products;
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


    public String getName_ingredient() {
        return name_ingredient;
    }

    public void setName_ingredient(String name_ingredient) {
        this.name_ingredient = name_ingredient;
    }

    public Set<ProductModel> getProducts() {
        return products;
    }

    public void setProducts(Set<ProductModel> products) {
        this.products = products;
    }

    public SupplierModel getId_supplier() {
        return id_supplier;
    }

    public void setId_supplier(SupplierModel id_supplier) {
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
                ", products=" + products +
                ", name_ingredient='" + name_ingredient + '\'' +
                ", id_supplier=" + id_supplier +
                ", stock_ingredient=" + stock_ingredient +
                ", best_of_ingredient=" + best_of_ingredient +
                '}';
    }
}