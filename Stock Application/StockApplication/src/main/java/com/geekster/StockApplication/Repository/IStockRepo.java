package com.geekster.StockApplication.Repository;

import com.geekster.StockApplication.Model.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStockRepo extends CrudRepository<Stock ,Long>{

    List<Stock> findByStockPriceGreaterThan(Double stockPrice);
}
