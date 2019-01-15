package com.wandm.burgermanager.repository;

import com.wandm.burgermanager.model.SupplierModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<SupplierModel, Integer> {
    SupplierModel findByNameSupplier(String nameSupplier);
}