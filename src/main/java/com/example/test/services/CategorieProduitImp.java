package com.example.test.services;

import com.example.test.entities.CategorieProduit;
import com.example.test.repository.CategorieProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieProduitImp implements ICategorieProduit{
    @Autowired
    CategorieProduitRepository categorieProduitRepository;
    @Override
    public List<CategorieProduit> retrieveAllCategorieProduits() {
        return categorieProduitRepository.findAll();
    }

    @Override
    public CategorieProduit addCategorieProduit(CategorieProduit cp) {
        return categorieProduitRepository.save(cp);
    }

    @Override
    public CategorieProduit updateCategorieProduit(CategorieProduit cp, Integer idCategorieProduit) {
        CategorieProduit cpr = categorieProduitRepository.findById(idCategorieProduit).orElse(null);
        cpr.setCodeProduit(cp.getCodeProduit());
        cpr.setLibelleCategorieProduit(cp.getLibelleCategorieProduit());
        return  categorieProduitRepository.save(cpr);
    }

    @Override
    public CategorieProduit retrieveCategorieProduit(Integer id) {
        return categorieProduitRepository.findById(id).orElse(null);
    }

    @Override
    public void removeCategorieProduit(Integer id) {
        categorieProduitRepository.deleteById(id);
    }
}
