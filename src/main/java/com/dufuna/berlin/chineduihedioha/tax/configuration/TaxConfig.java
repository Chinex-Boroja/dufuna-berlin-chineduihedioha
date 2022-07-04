package com.dufuna.berlin.chineduihedioha.tax.configuration;

import com.dufuna.berlin.chineduihedioha.tax.repository.TaxBracketRepository;
import com.dufuna.berlin.chineduihedioha.tax.service.TaxServiceCalculationImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TaxConfig {

//    // Income value passed an argument when calculateTax() is called by TaxServiceCalculationImpl
//    double income = 50000.00;
//
//    @Bean
//    public CommandLineRunner run(TaxBracketRepository repository) {
//        return (args -> {
//
//            //System.out.println(taxServiceCalculation().calculateTax(income));
//            //setDefaultValues(repository);
//
//            System.out.println(taxServiceCalculation().calculateTax(income));
//            System.out.println(repository.findAll());
//        });
//    }
//
//    @Bean
//    TaxServiceCalculationImpl taxServiceCalculation() {
//        return new TaxServiceCalculationImpl();
//    }
}
