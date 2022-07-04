package com.dufuna.berlin.chineduihedioha.tax.service;

import com.dufuna.berlin.chineduihedioha.tax.dto.TaxBracketResponse;
import com.dufuna.berlin.chineduihedioha.tax.dto.TaxRequest;
import com.dufuna.berlin.chineduihedioha.tax.model.TaxBracket;
import com.dufuna.berlin.chineduihedioha.tax.repository.TaxBracketRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Service
public class TaxServiceCalculationImpl implements TaxCalculationService{

    //injecting the object dependency implicitly to internally use setters or constructors
    @Autowired
    TaxBracketRepository taxBracketRepository;

    // Initializing the fields as an array,  used for performing tax calculation
    double[] taxBracketColumn = {0.00, 18200.00, 37000.00, 90000.00, 180000.00};
    double[] taxAmountToPay = {0.00, 0.00, 3571.81, 20796.49, 54096.12};
    double[] taxRates = {0.00, 0.19, 0.325, 0.37, 0.45};

    // Instantiating the values of in the TaxBracket used for calculation once the calculateTax() method
    // is called from TaxServiceCalculationImpl
    public TaxServiceCalculationImpl(double[] taxBracketColumn, double[] taxAmountToPay, double[] taxRates) {
        this.taxBracketColumn = taxBracketColumn;
        this.taxAmountToPay = taxAmountToPay;
        this.taxRates = taxRates;
    }

    /**
     *
     * @return the List of all the elements in TaxBracket by calling findAll() function
     */
    @Override
    public List<TaxBracket> getAllTaxBracket() {
        return (List<TaxBracket>) taxBracketRepository.findAll();
    }

    @Override
    public double calculateTax(double income) {

        // Get the updated values of the TaxBracket
        List<TaxBracket> allBracket = getAllTaxBracket();

        // This loops through the whole elements in the TaxBracket as long as it is > 0 and calculates the tax amount to pay
        for (int i = allBracket.size() - 1; i >= 0; i--) {
            if (income - allBracket.get(i).getNextTaskBracket() >= 0) {
                TaxBracket nextTaxBracket = allBracket.get(i);
//                double remainingTax = income - nextTaxBracket.getNextTaskBracket();
                return nextTaxBracket.getTaxAmountToPay() + ((income - nextTaxBracket.getNextTaskBracket()) * nextTaxBracket.getTaxRate());
            }

        }
        return 0;
    }

    /**
     * This is a function to run after @Bean initialization
     * This uses @PostConstruct annotation to populate the database and saving the default values
     */
    @PostConstruct
    public void setDefaultValues() {
        double[] taxBracketColumn = {0.00, 18200.00, 37000.00, 90000.00, 180000.00};
        double[] taxAmountToPay = {0.00, 0.00, 3571.81, 20796.49, 54096.12};
        double[] taxRates = {0.00, 0.19, 0.325, 0.37, 0.45};

        ArrayList<TaxBracket> taxBracketsList = new ArrayList<>();
        for (int i = 0; i < taxBracketColumn.length; i++) {
            TaxBracket taxBracket = new TaxBracket(taxBracketColumn[i], taxAmountToPay[i], taxRates[i]);
            taxBracketsList.add(taxBracket);
            taxBracketRepository.save(taxBracket);
        }
    }

    /**
     *
     * @param taxRequest is used for making API request for income
     * @return a response for the tax amount to pay
     */
    public TaxBracketResponse getTaxAmount(TaxRequest taxRequest) {

        double taxCalculated = calculateTax(taxRequest.getIncome());

        return TaxBracketResponse.builder().tax(taxCalculated).build();

    }
}
