package com.example.test.services;

import com.example.test.entities.Produit;

import java.util.List;

public interface IProduitService {
    public List<Produit> retrieveAllProduits();

    public Produit addProduit (Produit p, Long idCategorieProduit, Long idStock);

    public Produit updateProduit (Produit p, Long idCategorieProduit, Long idStock);

    public Produit retrieveProduit(Long id);
}
