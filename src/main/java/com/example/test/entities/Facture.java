package com.example.test.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long idFacture;
    private float montantRemise;
    private float montantFacture;
    @Temporal(TemporalType.DATE)
    private Date dateCreationFacture;
    @Temporal(TemporalType.DATE)
    private Date dateDerniereModification;
    private boolean archive;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facture")
    private Set<Reglement> reglements;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "facture")
    private Set<DetailFacture> detailFactures;
}
