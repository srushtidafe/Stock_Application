package com.geekster.StockApplication.Controller;

import com.geekster.StockApplication.Model.Stock;
import com.geekster.StockApplication.Service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StockController {
    @Autowired
    StockService stockService;

    @GetMapping(value = "Stocks")
    public Iterable<Stock> getAllStock(){
        return stockService.getAllStock();
    }

    @GetMapping(value = "Stock/stockId/{stockId}")
    public Iterable<Stock>  getStocksById(Iterable<Long> stockId){
        return stockService.getStockById(stockId);
    }
    @GetMapping(value = "Stock/StockPrice/{stockPrice}")
    public List<Stock> getStockGreaterThanPrice(@PathVariable Double stockPrice ){
        return stockService.getStockGreaterThanPrice(stockPrice);
    }
    @PostMapping(value = "stocks")
    public String addAllStock(List<Stock> stockList){
        stockService.addAllStock(stockList);
        return "Added successfully";
    }
    @PostMapping(value = "stock")
    public String addStock(Stock stock){
        stockService.addStock(stock);
        return "Added successfully";
    }
    @DeleteMapping(value = "Stock")
    public String removeStock(Stock stock){
        stockService.removeStock(stock);
        return "deleted";
    }
}
