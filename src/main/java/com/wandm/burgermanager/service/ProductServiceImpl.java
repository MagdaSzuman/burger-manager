package com.wandm.burgermanager.service;

import com.wandm.burgermanager.exceptions.IngredientDoesNotExistException;
import com.wandm.burgermanager.model.IngredientModel;
import com.wandm.burgermanager.model.ProductModel;
import com.wandm.burgermanager.model.TypeModel;
import com.wandm.burgermanager.repository.IngredientRepository;
import com.wandm.burgermanager.repository.ProductRepository;
import com.wandm.burgermanager.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    public ProductServiceImpl(ProductRepository productRepository, TypeRepository typeRepository, IngredientRepository ingredientRepository) {
        this.productRepository = productRepository;
        this.typeRepository = typeRepository;
        this.ingredientRepository = ingredientRepository;
    }

    public ProductRepository productRepository;
    public TypeRepository typeRepository;
    public IngredientRepository ingredientRepository;


    public  List<TypeModel> selectBurger(Integer idBurger) throws IngredientDoesNotExistException {

        Optional<ProductModel> byId = productRepository.findById(idBurger);
        List<TypeModel> listOfTypes = byId.get().getListOfTypes();

        for (int i = 0; i < listOfTypes.size(); i++) {

            if (listOfTypes.size() != 0) {

                IngredientModel byStock_ingredient = ingredientRepository.findByIdType(listOfTypes.get(i).getId());
                Integer portion_of_ingredient = byStock_ingredient.getPortion_of_ingredient();
                Integer stock_ingredient = byStock_ingredient.getStockIngredient();
                byStock_ingredient.setStockIngredient(stock_ingredient - portion_of_ingredient);
                ingredientRepository.save(byStock_ingredient);
                System.out.println(stock_ingredient);

            } else {
                throw new IngredientDoesNotExistException("Nie ma tego produktu");
            }
        }
        return Collections.emptyList();
    }
}
