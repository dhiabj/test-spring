package com.example.test.repository;

import com.example.test.entities.CategorieProduit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieProduitRepository extends JpaRepository<CategorieProduit,Integer> {
}
