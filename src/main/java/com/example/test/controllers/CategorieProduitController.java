package com.example.test.controllers;

import com.example.test.entities.CategorieProduit;
import com.example.test.services.ICategorieProduit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategorieProduitController {
    @Autowired
    ICategorieProduit iCategorieProduit;

    @PostMapping("/addCategorieProduit")
    public CategorieProduit addCategorieProduit(@RequestBody CategorieProduit cp)
    {
        return iCategorieProduit.addCategorieProduit(cp);
    }

    @GetMapping("/getCategorieProduit/{id}")
    public CategorieProduit retrieveCategorieProduit(@PathVariable Integer id)
    {
        return iCategorieProduit.retrieveCategorieProduit(id);
    }
    @GetMapping("/getAllCategorieProduits")
    public List<CategorieProduit> retrieveAllCategorieProduits()
    {
        return iCategorieProduit.retrieveAllCategorieProduits();
    }

    @DeleteMapping("/removeCategorieProduit/{idCategorieProduit}")
    public void removeCategorieProduit(@PathVariable Integer idCategorieProduit) {
        iCategorieProduit.removeCategorieProduit(idCategorieProduit);
    }

    @PutMapping("/updateCategorieProduit/{idCategorieProduit}")
    public CategorieProduit updateCategorieProduit(@RequestBody CategorieProduit cp, @PathVariable Integer idCategorieProduit) {
        return  iCategorieProduit.updateCategorieProduit(cp,idCategorieProduit);
    }
}
