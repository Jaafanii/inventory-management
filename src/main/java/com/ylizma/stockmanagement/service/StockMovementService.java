package com.ylizma.stockmanagement.service;

import com.ylizma.stockmanagement.domain.StockMovementDetails;
import org.springframework.http.ResponseEntity;

import java.text.ParseException;
import java.util.List;

public interface StockMovementService {

    StockMovementDetails findById(Long id);

    List<StockMovementDetails> findAll();

    ResponseEntity<Object> save(StockMovementDetails p) throws ParseException;

//    ResponseEntity<Object> update(StockMovementDetails p, Long id);

    ResponseEntity<Object> delete(Long id);
}
