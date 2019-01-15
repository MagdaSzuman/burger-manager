package com.wandm.burgermanager.repository;

import com.wandm.burgermanager.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Long> {

    ProductModel findByNameBurger(String nameBurger);
}