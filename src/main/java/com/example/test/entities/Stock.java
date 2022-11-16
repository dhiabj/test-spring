package com.example.test.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Integer idStock;
    private Integer qte;
    private Integer qteMin;
    private String libelleStock;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "stock")
    private Set<Produit> produits;
}
