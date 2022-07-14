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

        // Get a single Lekki property using the index of the property in the list
        // Display the property on the console
        LekkiProperty getPropertySaved = mockLekkiPropertyService.getProperty(0);
        System.out.println("Found " + getPropertySaved);

        // Fetch all the Lekki property objects and display them
        ArrayList<LekkiProperty> allProperty = mockLekkiPropertyService.getProperties();
        System.out.println("All Lekki Property Listed: " + allProperty);

    }
}