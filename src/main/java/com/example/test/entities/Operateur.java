package com.example.test.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
public class Operateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long idOperateur;
    private String nom;
    private String prenom;
    private String password;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Facture> factures;
}
