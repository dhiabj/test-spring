package com.example.test.entities;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
public class SecteurActivite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long idSecteurActivite;
    private String codeSecteurActivite;
    private String libelleSecteurActivite;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Fournisseur> fournisseurs;
}
