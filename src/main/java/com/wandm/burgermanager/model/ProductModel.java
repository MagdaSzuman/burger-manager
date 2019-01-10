package com.wandm.burgermanager.model;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long id_burger;
    private String name_burger;

    @ManyToMany (cascade=CascadeType.ALL)
    @JoinTable(
            name = "Product_Ingredient",
            joinColumns = { @JoinColumn(name = "product_id") },
            inverseJoinColumns = { @JoinColumn(name = "ingredient_id") }
    )
    Set<IngredientModel> ingredients = new HashSet<>();

    private Long ingredient_quantity;




    public ProductModel() {
    }

    public ProductModel(Long id_burger, String name_burger, Set<IngredientModel> ingredients, Long ingredient_quantity) {
        this.id_burger = id_burger;
        this.name_burger = name_burger;
        this.ingredients = ingredients;
        this.ingredient_quantity = ingredient_quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_burger() {
        return id_burger;
    }

    public void setId_burger(Long id_burger) {
        this.id_burger = id_burger;
    }

    public String getName_burger() {
        return name_burger;
    }

    public void setName_burger(String name_burger) {
        this.name_burger = name_burger;
    }

    public Set<IngredientModel> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<IngredientModel> ingredients) {
        this.ingredients = ingredients;
    }

    public Long getIngredient_quantity() {
        return ingredient_quantity;
    }

    public void setIngredient_quantity(Long ingredient_quantity) {
        this.ingredient_quantity = ingredient_quantity;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "id=" + id +
                ", id_burger=" + id_burger +
                ", name_burger='" + name_burger + '\'' +
                ", ingredients=" + ingredients +
                ", ingredient_quantity=" + ingredient_quantity +
                '}';
    }
}
