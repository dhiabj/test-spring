package com.example.test.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class DetailFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long idDetailFacture;
    private Integer qteCommandee;
    private float prixTotalDetail;
    private Integer pourcentageRemise;
    private float montantRemise;
    @ManyToOne(cascade = CascadeType.ALL)
    private Facture facture;
}
