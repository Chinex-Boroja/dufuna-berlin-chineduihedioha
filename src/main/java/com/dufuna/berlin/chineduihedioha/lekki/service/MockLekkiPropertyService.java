package com.dufuna.berlin.chineduihedioha.lekki.service;

import com.dufuna.berlin.chineduihedioha.lekki.model.LekkiProperty;
import com.dufuna.berlin.chineduihedioha.lekki.repository.SimpleLekkiPropertyRepositoryImpl;

import java.util.ArrayList;

public class MockLekkiPropertyService implements LekkiPropertyService {

    SimpleLekkiPropertyRepositoryImpl propertyRepository = new SimpleLekkiPropertyRepositoryImpl();

    @Override
    public LekkiProperty saveProperty(LekkiProperty lekkiProperty) {
        System.out.println(this.getClass().getSimpleName() + "." + "saveProperty" + " called");
        return propertyRepository.save(lekkiProperty);
    }

    @Override
    public LekkiProperty getProperty(int lekkiPropertyId) {
        System.out.println(this.getClass().getSimpleName() + "." + "getProperty" + " called");
        return propertyRepository.findById(lekkiPropertyId);
    }

    @Override
    public ArrayList<LekkiProperty> getProperties() {
        return propertyRepository.findAll();
    }
}
