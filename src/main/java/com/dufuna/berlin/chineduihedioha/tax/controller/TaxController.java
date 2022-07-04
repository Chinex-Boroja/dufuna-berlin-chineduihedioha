package com.dufuna.berlin.chineduihedioha.tax.controller;

import com.dufuna.berlin.chineduihedioha.tax.dto.TaxBracketResponse;
import com.dufuna.berlin.chineduihedioha.tax.dto.TaxRequest;
import com.dufuna.berlin.chineduihedioha.tax.service.TaxServiceCalculationImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/tax/calculation")
public class TaxController {

    private final TaxServiceCalculationImpl taxServiceCalculation;

    @Autowired
    public TaxController(TaxServiceCalculationImpl taxServiceCalculation) {
        this.taxServiceCalculation = taxServiceCalculation;
    }

    @PostMapping
    public ResponseEntity<TaxBracketResponse> getTaxAmount(@RequestBody TaxRequest taxRequest) {
        TaxBracketResponse response = taxServiceCalculation.getTaxAmount(taxRequest);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
