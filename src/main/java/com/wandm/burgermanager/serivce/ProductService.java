package com.wandm.burgermanager.serivce;

import com.wandm.burgermanager.model.IngredientModel;



import java.util.Set;

public interface ProductService {
 void addProduct(Integer id_burger, String nameBurger, Set<IngredientModel> ingredients, Integer ingredient_quantity);

}
