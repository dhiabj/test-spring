package com.example.test.controllers;

import com.example.test.entities.CategorieProduit;
import com.example.test.entities.Stock;
import com.example.test.services.ICategorieProduit;
import com.example.test.services.IStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StockController {
    @Autowired
    IStockService iStockService;

    @PostMapping("/addStock")
    public Stock addStock(@RequestBody Stock s)
    {
        return iStockService.addStock(s);
    }

    @GetMapping("/getStock/{id}")
    public Stock retrieveStock(@PathVariable Integer id)
    {
        return iStockService.retrieveStock(id);
    }
    @GetMapping("/getAllStocks")
    public List<Stock> retrieveAllStocks()
    {
        return iStockService.retrieveAllStocks();
    }

    @DeleteMapping("/removeStock/{idStock}")
    public void removeStock(@PathVariable Integer idStock) {
        iStockService.removeStock(idStock);
    }

    @PutMapping("/updateStock/{idStock}")
    public Stock updateStock(@RequestBody Stock s, @PathVariable Integer idStock) {
        return  iStockService.updateStock(s,idStock);
    }
}
