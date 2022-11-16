package com.example.test.services;

import com.example.test.entities.Stock;

import java.util.List;

public interface IStockService {
   public List<Stock> retrieveAllStocks();

   public Stock addStock(Stock s);

    public Stock updateStock(Stock s, Integer idStock);

    public Stock retrieveStock(Integer id);

    public void removeStock(Integer id);
}
