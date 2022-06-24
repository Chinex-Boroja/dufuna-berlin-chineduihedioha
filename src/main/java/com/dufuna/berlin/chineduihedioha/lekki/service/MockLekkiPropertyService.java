package com.dufuna.berlin.chineduihedioha.lekki.service;

import com.dufuna.berlin.chineduihedioha.lekki.model.LekkiProperty;

public class MockLekkiPropertyService implements LekkiPropertyService {

    @Override
    public void saveProperty(LekkiProperty lekkiProperty) {
        System.out.println(this.getClass().getSimpleName() + "." + "saveProperty" + " called");
    }

    @Override
    public LekkiProperty getProperty() {
        System.out.println(this.getClass().getSimpleName() + "." + "getProperty" + " called");
        return null;

    }
}
