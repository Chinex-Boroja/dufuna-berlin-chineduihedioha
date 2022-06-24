package com.dufuna.berlin.chineduihedioha.lekki;

import com.dufuna.berlin.chineduihedioha.lekki.model.LekkiProperty;
import com.dufuna.berlin.chineduihedioha.lekki.service.MockLekkiPropertyService;

public class MockLekkiPropertyApp {

    public static void main(String[] args) {

        LekkiProperty lekkiProperty = new LekkiProperty();
        lekkiProperty.setPropertyId(0);
        lekkiProperty.setPropertyAddress("Block2 Ozumba Mbadiwe way");
        lekkiProperty.setPropertyType("House");
        lekkiProperty.setNumberOfBedrooms(8);
        lekkiProperty.setNumberOfSittingRooms(4);
        lekkiProperty.setNumberOfKitchens(2);
        lekkiProperty.setNumberOfBathrooms(8);
        lekkiProperty.setNumberOfToilets(6);
        lekkiProperty.setPropertyOwner("Mr John Doe");
        lekkiProperty.setDescription("Arctica Duplex");
        lekkiProperty.setValidFrom("10/07/2022");
        lekkiProperty.setValidTo("01/12/2023");

        System.out.println(lekkiProperty);
        System.out.println(lekkiProperty.getDescription() + " has " + lekkiProperty.getNumberOfBathrooms() + " bathrooms");
        System.out.println("The owner of " + lekkiProperty.getDescription() + " is " + lekkiProperty.getPropertyOwner());

        MockLekkiPropertyService mockLekkiPropertyService = new MockLekkiPropertyService();
        mockLekkiPropertyService.saveProperty(lekkiProperty);
        mockLekkiPropertyService.getProperty();

    }
}