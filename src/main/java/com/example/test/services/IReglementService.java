package com.example.test.services;

import com.example.test.entities.Reglement;

import java.util.List;

public interface IReglementService {
    public List<Reglement> retrieveAllReglements();

    public Reglement addReglement (Reglement r);
    public Reglement updateReglement (Reglement r, Integer idReglement);
    public Reglement retrieveReglement (Integer idReglement);
    public void removeReglement(Integer idReglement);
}
