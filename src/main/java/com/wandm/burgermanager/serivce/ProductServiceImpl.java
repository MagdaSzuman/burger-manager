package com.wandm.burgermanager.serivce;

import com.wandm.burgermanager.model.IngredientModel;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class ProductServiceImpl implements ProductService {


    @Override
    public void addProduct(Long id_burger, String name_burger, Set<IngredientModel> ingredients, Long ingredient_quantity) {

    }
}
