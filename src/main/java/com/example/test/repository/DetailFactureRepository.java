package com.example.test.repository;

import com.example.test.entities.DetailFacture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailFactureRepository extends JpaRepository<DetailFacture,Integer> {
}
