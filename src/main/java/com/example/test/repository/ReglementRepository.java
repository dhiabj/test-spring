package com.example.test.repository;

import com.example.test.entities.Reglement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReglementRepository extends JpaRepository<Reglement,Integer> {
}
