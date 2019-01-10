package com.wandm.burgermanager.mapper;

import com.wandm.burgermanager.model.IngredientModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class IngredientMapper implements RowMapper<IngredientModel> {
    @Override
    public IngredientModel mapRow(ResultSet resultSet, int i) throws SQLException {
        IngredientModel ingredientModel = new IngredientModel();
        ingredientModel.setId(resultSet.getLong("id"));
      //  ingredientModel.setId_ingredient(resultSet.getLong("id_ingredient"));
        ingredientModel.setName_ingredient(resultSet.getString("name_ingredient"));
       // ingredientModel.setId_ingredient(resultSet.getLong("id_supplier"));
        ingredientModel.setStock_ingredient(resultSet.getLong("stock_ingredient"));
        ingredientModel.setBest_of_ingredient(resultSet.getDate("best_of_ingredient"));
        return ingredientModel;
    }
}
