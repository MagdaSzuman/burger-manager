package com.wandm.burgermanager.mapper;

import com.wandm.burgermanager.model.ProductModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements RowMapper<ProductModel> {
    @Override
    public ProductModel mapRow(ResultSet resultSet, int i) throws SQLException {
        ProductModel productModel = new ProductModel();
        productModel.setId(resultSet.getLong("id"));
        productModel.setId_burger(resultSet.getLong("id_burger"));
        productModel.setName_burger(resultSet.getString("name_burger"));
        productModel.setId_ingredient(resultSet.getLong("id_ingredient"));
        productModel.setIngredient_quantity(resultSet.getLong("ingredient_quantity"));
        return productModel;
    }
}
