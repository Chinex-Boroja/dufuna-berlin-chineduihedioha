package com.dufuna.berlin.chineduihedioha.lekki.repository;

import com.dufuna.berlin.chineduihedioha.lekki.model.LekkiProperty;

import java.util.List;

public interface SimpleLekkiPropertyRepository {

    LekkiProperty save(LekkiProperty lekkiProperty);

    LekkiProperty findById(int lekkiPropertyId);

    List<LekkiProperty> findAll();

    void update(LekkiProperty newLekkiProperty);
}
