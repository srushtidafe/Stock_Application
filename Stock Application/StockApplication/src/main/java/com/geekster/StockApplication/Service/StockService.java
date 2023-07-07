package com.geekster.StockApplication.Service;

import com.geekster.StockApplication.Model.Stock;
import com.geekster.StockApplication.Repository.IStockRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {
    @Autowired
    IStockRepo stockRepo;

    public Iterable<Stock>  getAllStock() {
        return stockRepo.findAll();
    }

    public void addAllStock(List<Stock> stockList) {
        stockRepo.saveAll(stockList);
    }

    public void removeStock(Stock stock) {
        stockRepo.delete(stock);
    }

    public Iterable<Stock> getStockById(Iterable<Long> stockId) {
        return stockRepo.findAllById(stockId);
    }

    public void addStock(Stock stock) {
        stockRepo.save(stock);
    }

    public List<Stock> getStockGreaterThanPrice( Double stockPrice) {
        return stockRepo.findByStockPriceGreaterThan(stockPrice);
    }
}
