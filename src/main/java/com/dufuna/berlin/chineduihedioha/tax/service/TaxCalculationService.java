package com.dufuna.berlin.chineduihedioha.tax.service;

import com.dufuna.berlin.chineduihedioha.tax.model.TaxBracket;

import java.util.List;

public interface TaxCalculationService {

    /**
     * Function to get the all values of TaxBracket
     * @return TaxBracket List in rows and columns
     */
    List<TaxBracket> getAllTaxBracket();

    /**
     * This is a simple method that calculates individuals task
     * @param income takes the amount of user's income
     * @return the taxable amount calculated
     */
    double calculateTax(double income);
}
