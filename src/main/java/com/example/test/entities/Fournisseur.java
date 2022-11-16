package com.example.test.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long idFournisseur;
    private String codeFournisseur;
    private String libelleFournisseur;
    private CategorieFournisseur categorieFournisseur;
    @OneToOne(mappedBy = "fournisseur")
    private DetailFournisseur detailFournisseur;
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "fournisseurs")
    private Set<SecteurActivite> secteurActivites;
}
