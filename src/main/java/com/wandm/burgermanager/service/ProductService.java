package com.wandm.burgermanager.service;

import com.wandm.burgermanager.exceptions.IngredientDoesNotExistException;
import com.wandm.burgermanager.model.TypeModel;

import java.util.List;

public interface ProductService {
    List<TypeModel> selectBurger(Integer idBurger)throws IngredientDoesNotExistException;
}
