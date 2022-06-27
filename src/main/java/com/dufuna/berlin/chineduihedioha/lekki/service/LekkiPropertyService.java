package com.dufuna.berlin.chineduihedioha.lekki.service;

import com.dufuna.berlin.chineduihedioha.lekki.model.LekkiProperty;

import java.util.List;

public interface LekkiPropertyService {

    LekkiProperty saveProperty(LekkiProperty lekkiProperty);

    LekkiProperty getProperty(int lekkiPropertyId);

    List<LekkiProperty> getProperties();
}
