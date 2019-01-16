package com.wandm.burgermanager.model;


import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TypeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer quantity;

    public TypeModel() {
    }

    @Autowired
    public TypeModel(String name, Integer quantity) {
        this.name = name;
        this.quantity = quantity;
    }



    //    public List<ProductModel> showList() {
//        List<ProductModel> list = new ArrayList<>();
//        list.add(new ProductModel("Classic",    ));
//        return list;
//    }
}
