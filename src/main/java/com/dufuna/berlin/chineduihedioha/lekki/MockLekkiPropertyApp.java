package com.dufuna.berlin.chineduihedioha.lekki;

import com.dufuna.berlin.chineduihedioha.lekki.model.LekkiProperty;
import com.dufuna.berlin.chineduihedioha.lekki.service.MockLekkiPropertyService;

import java.util.ArrayList;

public class MockLekkiPropertyApp {

    public static void main(String[] args) {

        MockLekkiPropertyService mockLekkiPropertyService = new MockLekkiPropertyService();

        String[] propertyTypeArr = {"Flat", "Bungalow", "Duplex", "Mansion"};
        String[] propertyAddressArr = {"Block2 Ozumba Mbadiwe way", "Line1 Modomo Phase 1", "Block4 Landmark Arena", "3 Elegushi Cresent"};

        //Using an ArrayList to Keep LekkiProperty objects
        ArrayList<LekkiProperty> lekkiProperties = new ArrayList<>();

        for (int i = 0; i < propertyAddressArr.length; i++) {
            LekkiProperty lekkiProperty = new LekkiProperty(i, propertyTypeArr[i], propertyAddressArr[i]);
            lekkiProperties.add(lekkiProperty);

            // Saving Lekki Properties created using LekkiPropertyService & display the result
            LekkiProperty savedLekkiProperty = mockLekkiPropertyService.saveProperty(lekkiProperty);
            System.out.println(savedLekkiProperty);
            System.out.println();
        }

//        System.out.println(lekkiProperties);

        // Get a single Lekki property using the index of the property in the list
        // Display the property on the console
        LekkiProperty getPropertySaved = mockLekkiPropertyService.getProperty(0);
        System.out.println("Found " + getPropertySaved);

        // Fetch all the Lekki property objects and display them
        ArrayList<LekkiProperty> allProperty = mockLekkiPropertyService.getProperties();
        System.out.println("All Lekki Property Listed: " + allProperty);


//        LekkiProperty lekkiProperty = new LekkiProperty();
//        lekkiProperty.setPropertyId(0);
//        lekkiProperty.setPropertyAddress("Block2 Ozumba Mbadiwe way");
//        lekkiProperty.setPropertyType("House");
//        lekkiProperty.setNumberOfBedrooms(8);
//        lekkiProperty.setNumberOfSittingRooms(4);
//        lekkiProperty.setNumberOfKitchens(2);
//        lekkiProperty.setNumberOfBathrooms(8);
//        lekkiProperty.setNumberOfToilets(6);
//        lekkiProperty.setPropertyOwner("Mr John Doe");
//        lekkiProperty.setDescription("Arctica Duplex");
//        lekkiProperty.setValidFrom("10/07/2022");
//        lekkiProperty.setValidTo("01/12/2023");

//        System.out.println(lekkiProperty);
//        System.out.println(lekkiProperty.getDescription() + " has " + lekkiProperty.getNumberOfBathrooms() + " bathrooms");
//        System.out.println("The owner of " + lekkiProperty.getDescription() + " is " + lekkiProperty.getPropertyOwner());
//
//        MockLekkiPropertyService mockLekkiPropertyService = new MockLekkiPropertyService();
//        mockLekkiPropertyService.saveProperty(lekkiProperty);
//        mockLekkiPropertyService.getProperty();

    }
}