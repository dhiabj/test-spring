package com.example.test.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
public class CategorieProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Integer idCategorieProduit;
    private String codeProduit;
    private String libelleCategorieProduit;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categorieProduit")
    private Set<Produit> produits;
}
