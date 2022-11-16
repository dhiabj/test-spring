package com.example.test.services;

import com.example.test.entities.CategorieProduit;

import java.util.List;

public interface ICategorieProduit {
    public List<CategorieProduit> retrieveAllCategorieProduits();

    public CategorieProduit addCategorieProduit(CategorieProduit cp);

    public CategorieProduit updateCategorieProduit(CategorieProduit cp, Integer idCategorieProduit);

    public CategorieProduit retrieveCategorieProduit(Integer id);

    public void removeCategorieProduit(Integer id);
}
