package com.wandm.burgermanager.repository;

import com.wandm.burgermanager.model.TypeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<TypeModel, Integer> {
    TypeModel findByName(String name_supplier);
}