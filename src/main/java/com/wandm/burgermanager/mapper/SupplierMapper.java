package com.wandm.burgermanager.mapper;

import com.wandm.burgermanager.model.SupplierModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SupplierMapper implements RowMapper<SupplierModel> {
    @Override
    public SupplierModel mapRow(ResultSet resultSet, int i) throws SQLException {
        SupplierModel supplierModel = new SupplierModel();
        supplierModel.setId_supplier(resultSet.getLong("id_supplier"));
        supplierModel.setName_supplier(resultSet.getString("name_supplier"));
        supplierModel.setAddress_supplier(resultSet.getString("address_supplier"));
        return supplierModel;
    }
}
