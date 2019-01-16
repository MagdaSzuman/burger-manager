package com.wandm.burgermanager;

import com.wandm.burgermanager.model.IngredientModel;
import com.wandm.burgermanager.model.ProductModel;
import com.wandm.burgermanager.model.SupplierModel;
import com.wandm.burgermanager.model.TypeModel;
import com.wandm.burgermanager.repository.IngredientRepository;
import com.wandm.burgermanager.repository.ProductRepository;
import com.wandm.burgermanager.repository.SupplierRepository;
import com.wandm.burgermanager.repository.TypeRepository;
import io.swagger.models.auth.In;
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

    @Autowired
    TypeRepository typeRepository;

    @Bean
    public CommandLineRunner test() {
        return (args -> {



            SupplierModel supplierModel = new SupplierModel("Pieczywo", "Szczecin");
            List<SupplierModel> id_ingredient = new ArrayList<>();
            id_ingredient.add(supplierModel);
            SupplierModel save1 = supplierRepository.save(supplierModel);

            IngredientModel ingredientModel = new IngredientModel("roll", save1, 15, LocalDateTime.now().toEpochSecond(ZoneOffset.UTC), 1);
            ingredientRepository.save(ingredientModel);

            ProductModel productModel = new ProductModel("Classic");
            List<Integer> listOfIngredients = new ArrayList<>();
            productModel.listOfIngredients.add(1);
            //productModel.listOfIngredients.set(id_ingredient.get(1)).equals("roll");


            ProductModel save = productRepository.save(productModel);



        });
    }


}
