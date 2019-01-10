package com.wandm.burgermanager.repository;

import com.wandm.burgermanager.model.BurgerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BurgerRepository extends JpaRepository<BurgerModel, Long> {
}
