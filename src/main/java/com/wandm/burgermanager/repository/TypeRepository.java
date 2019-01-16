package com.wandm.burgermanager.repository;

import com.wandm.burgermanager.model.TypeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository extends JpaRepository<TypeModel, Integer> {
}
