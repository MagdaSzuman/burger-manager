package com.wandm.burgermanager.repository;

import com.wandm.burgermanager.model.IngredientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends JpaRepository<IngredientModel, Integer> {
    IngredientModel findByNameIngredient(String name_ingredient);
    IngredientModel findByIdType(Integer idType);
}
