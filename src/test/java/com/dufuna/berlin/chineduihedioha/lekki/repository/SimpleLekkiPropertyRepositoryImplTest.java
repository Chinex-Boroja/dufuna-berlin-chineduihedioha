package com.dufuna.berlin.chineduihedioha.lekki.repository;

import com.dufuna.berlin.chineduihedioha.lekki.model.LekkiProperty;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SimpleLekkiPropertyRepositoryImplTest {

    SimpleLekkiPropertyRepositoryImpl repository = new SimpleLekkiPropertyRepositoryImpl();

    @org.junit.jupiter.api.Test
    void save() {
        //declaring and instantiating a new Lekki Property with ID number, property type and property address
        LekkiProperty lekkiProperty = new LekkiProperty(4, "Bungalow", "Line1 Modomo Phase 1" );

        LekkiProperty testProperty = repository.save(lekkiProperty);

        //Test actual property
        assertEquals(repository.findById(4), testProperty);
    }

    @org.junit.jupiter.api.Test
    void findById() {
        LekkiProperty lekkiProperty4 = new LekkiProperty(4, "Bungalow", "Line1 Modomo Phase 1");
        LekkiProperty lekkiProperty2 = new LekkiProperty(2, "Flat", "Phase 2 Ikoyi park" );
        LekkiProperty lekkiProperty1 = new LekkiProperty(1, "Duplex", "Line1 Lekki Phase 1");

        LekkiProperty testProperty4 = repository.save(lekkiProperty4);
        LekkiProperty testProperty2 = repository.save(lekkiProperty2);
        LekkiProperty testProperty1 = repository.save(lekkiProperty1);

        assertEquals(repository.findById(4), testProperty4);
        assertEquals(repository.findById(2), testProperty2);
        assertEquals(repository.findById(1), testProperty1);

    }

    @org.junit.jupiter.api.Test
    void findAll() {
        LekkiProperty lekkiProperty4 = new LekkiProperty(4, "Bungalow", "Line1 Modomo Phase 1");
        LekkiProperty lekkiProperty2 = new LekkiProperty(2, "Flat", "Phase 2 Ikoyi park" );
        LekkiProperty lekkiProperty1 = new LekkiProperty(1, "Duplex", "Line1 Lekki Phase 1");

        ArrayList<LekkiProperty> propertiesDb = new ArrayList<>();
        propertiesDb.add(lekkiProperty1);
        propertiesDb.add(lekkiProperty2);
        propertiesDb.add(lekkiProperty4);

        //save properties
        repository.save(lekkiProperty1);
        repository.save(lekkiProperty2);
        repository.save(lekkiProperty4);

        assertEquals(repository.findAll(), propertiesDb);
    }

    @org.junit.jupiter.api.Test
    void update() {

        LekkiProperty lekkiProperty4 = new LekkiProperty(4, "Bungalow", "Line1 Modomo Phase 1");
        LekkiProperty lekkiProperty2 = new LekkiProperty(2, "Flat", "Phase 2 Ikoyi park" );
        LekkiProperty lekkiProperty1 = new LekkiProperty(1, "Duplex", "Line1 Lekki Phase 1");

        //adding the property1 to repository
        repository.save(lekkiProperty1);

        //check if the property was properly updated to property2
        assertEquals(repository.findById(1), lekkiProperty1);

        LekkiProperty lekkiPropertyUpdate = new LekkiProperty(2, "Duplex", "Line1 Lekki Phase 1");


    }
}