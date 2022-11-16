package com.example.test.services;

import com.example.test.entities.CategorieProduit;
import com.example.test.entities.Stock;
import com.example.test.repository.CategorieProduitRepository;
import com.example.test.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImp implements IStockService{
    @Autowired
    StockRepository stockRepository;
    @Override
    public List<Stock> retrieveAllStocks() {
        return stockRepository.findAll();
    }

    @Override
    public Stock addStock(Stock s) {
        return stockRepository.save(s);
    }

    @Override
    public Stock updateStock(Stock s, Integer idStock) {
        Stock stock = stockRepository.findById(idStock).orElse(null);
        stock.setLibelleStock(s.getLibelleStock());
        stock.setQte(s.getQte());
        stock.setQteMin(s.getQteMin());
        return  stockRepository.save(stock);
    }

    @Override
    public Stock retrieveStock(Integer id) {
        return stockRepository.findById(id).orElse(null);
    }

    @Override
    public void removeStock(Integer id) {
        stockRepository.deleteById(id);
    }
}
