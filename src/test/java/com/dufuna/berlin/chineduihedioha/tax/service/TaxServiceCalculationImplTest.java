package com.dufuna.berlin.chineduihedioha.tax.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaxServiceCalculationImplTest {

    @Autowired
    TaxCalculationService taxCalculationService;

    @Test
    void getAllTaxBracket() {
        var allTaxBracket = taxCalculationService.getAllTaxBracket();
        assertNotNull(allTaxBracket);
    }

    @Test
    void calculateTax() {
        assertEquals(0.00, taxCalculationService.calculateTax(0.00));
    }

    @Test
    void calculateTax1() {
        assertEquals(0.19, taxCalculationService.calculateTax(18201.00));
    }

    @Test
    void calculateTax2() {
        assertEquals(7796.8099999999995, taxCalculationService.calculateTax(50000.00));
    }

    @Test
    void calculateTax3() {
        assertEquals(0.00, taxCalculationService.calculateTax(18200.00));
    }

    @Test
    void calculateTax4() {
        assertEquals(558096.12, taxCalculationService.calculateTax(1300000));
    }
}