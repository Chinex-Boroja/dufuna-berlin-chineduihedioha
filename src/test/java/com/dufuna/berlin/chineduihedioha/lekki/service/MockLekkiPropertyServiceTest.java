package com.dufuna.berlin.chineduihedioha.lekki.service;

import com.dufuna.berlin.chineduihedioha.lekki.model.LekkiProperty;
import com.dufuna.berlin.chineduihedioha.lekki.repository.SimpleLekkiPropertyRepositoryImpl;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MockLekkiPropertyServiceTest {

    MockLekkiPropertyService propertyService = new MockLekkiPropertyService();

    @Test
    void saveProperty() {

        //declaring and instantiating a new Lekki Property with ID number, property type and property address
        LekkiProperty lekkiProperty = new LekkiProperty(4, "Bungalow", "Line1 Modomo Phase 1" );

        LekkiProperty testProperty = propertyService.saveProperty(lekkiProperty);

        //Test actual property
        assertEquals(propertyService.getProperty(4), testProperty);
    }

    @Test
    void getProperty() {

        LekkiProperty lekkiProperty4 = new LekkiProperty(4, "Bungalow", "Line1 Modomo Phase 1");
        LekkiProperty lekkiProperty2 = new LekkiProperty(2, "Flat", "Phase 2 Ikoyi park" );
        LekkiProperty lekkiProperty1 = new LekkiProperty(1, "Duplex", "Line1 Lekki Phase 1");

        propertyService.saveProperty(lekkiProperty4);
        propertyService.saveProperty(lekkiProperty2);
        propertyService.saveProperty(lekkiProperty1);

        assertEquals(propertyService.getProperty(4), lekkiProperty4);
        assertEquals(propertyService.getProperty(2), lekkiProperty2);
        assertEquals(propertyService.getProperty(1), lekkiProperty1);
    }

    @Test
    void getProperties() {

        LekkiProperty lekkiProperty4 = new LekkiProperty(4, "Bungalow", "Line1 Modomo Phase 1");
        LekkiProperty lekkiProperty2 = new LekkiProperty(2, "Flat", "Phase 2 Ikoyi park" );
        LekkiProperty lekkiProperty1 = new LekkiProperty(1, "Duplex", "Line1 Lekki Phase 1");

        ArrayList<LekkiProperty> propertiesDb = new ArrayList<>();
        propertiesDb.add(lekkiProperty1);
        propertiesDb.add(lekkiProperty2);
        propertiesDb.add(lekkiProperty4);

        //save properties
        propertyService.saveProperty(lekkiProperty1);
        propertyService.saveProperty(lekkiProperty2);
        propertyService.saveProperty(lekkiProperty4);

        assertEquals(propertyService.getProperties(), propertiesDb);
    }
}
