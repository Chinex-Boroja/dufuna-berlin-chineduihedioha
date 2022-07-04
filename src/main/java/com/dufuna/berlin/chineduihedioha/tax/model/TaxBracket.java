package com.dufuna.berlin.chineduihedioha.tax.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@ToString
@NoArgsConstructor

public class TaxBracket {

    @Id
    @GeneratedValue
    private Long id;
    private double nextTaskBracket;
    private double taxAmountToPay;
    private double taxRate;

    /**
     * This creates instances of TaxBracket
     * id field is generated automatically
     * @param nextTaskBracket specifies tax bracket in monetary value
     * @param taxAmountToPay specifies amount of task to pay
     * @param taxRate species the rate of specified amount
     */
    public TaxBracket(double nextTaskBracket, double taxAmountToPay, double taxRate) {
        setNextTaskBracket(nextTaskBracket);
        setTaxAmountToPay(taxAmountToPay);
        setTaxRate(taxRate);
    }

    /**
     * The id field is generated automatically using the @GeneratedValue annotation
     * @param id specifies each role in the TaxBracket Database
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *
     * @return the id of each row in the Database
     */
    public Long getId() {
        return id;
    }
}
