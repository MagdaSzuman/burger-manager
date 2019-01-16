package com.wandm.burgermanager;

import com.wandm.burgermanager.model.IngredientModel;
import com.wandm.burgermanager.model.ProductModel;
import com.wandm.burgermanager.model.SupplierModel;
import com.wandm.burgermanager.model.TypeModel;
import com.wandm.burgermanager.repository.IngredientRepository;
import com.wandm.burgermanager.repository.ProductRepository;
import com.wandm.burgermanager.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.*;

@SpringBootApplication
public class BurgerManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BurgerManagerApplication.class, args);
    }

    @Autowired
    ProductRepository productRepository;

    @Autowired
    IngredientRepository ingredientRepository;

    @Autowired
    SupplierRepository supplierRepository;

    @Bean
    public CommandLineRunner test(){
//        List<Integer> listOfIngredients = new ArrayList<>();
//        listOfIngredients.add(11);
//        listOfIngredients.add(22);
//        listOfIngredients.add(33);
//        listOfIngredients.add(44);


        return (args -> {
            SupplierModel supplierModel = new SupplierModel("Pieczywo","Szczecin");
            List<SupplierModel> id_ingredient = new ArrayList<>();
            id_ingredient.add(supplierModel);
            SupplierModel save1 = supplierRepository.save(supplierModel);


            ProductModel productModel = new ProductModel("Classic");
            productModel.getListofTypes().add(new TypeModel("Bulka"));

            ProductModel save = productRepository.save(productModel);

            IngredientModel ingredientModel = new IngredientModel("roll", save1, 15, LocalDateTime.now().toEpochSecond(ZoneOffset.UTC), 1, 1);
            ingredientRepository.save(ingredientModel);
//            Set<IngredientModel> ingredients = new HashSet<>();
//            ingredients.add(ingredientModel);
            // productModel.setIngredients(ingredients);

        });
    }

}

