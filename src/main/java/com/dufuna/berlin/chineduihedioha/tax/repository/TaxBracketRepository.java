package com.dufuna.berlin.chineduihedioha.tax.repository;

import com.dufuna.berlin.chineduihedioha.tax.model.TaxBracket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * This is simple class for performing CRUD operation using Spring data JPA dependency
 * Passed TaxBracket Entity and the ID as parameters
 */
@Repository
public interface TaxBracketRepository extends CrudRepository<TaxBracket, Long> {

}
