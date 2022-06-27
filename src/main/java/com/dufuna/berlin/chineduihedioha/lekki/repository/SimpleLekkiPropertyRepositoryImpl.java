package com.dufuna.berlin.chineduihedioha.lekki.repository;

import com.dufuna.berlin.chineduihedioha.lekki.model.LekkiProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SimpleLekkiPropertyRepositoryImpl implements SimpleLekkiPropertyRepository {

    Map<Integer, LekkiProperty> lekkiPropertyDb = new HashMap<>();

    @Override
    public LekkiProperty save(LekkiProperty lekkiProperty) {

        int propertyId = lekkiProperty.getPropertyId();
        lekkiPropertyDb.put(propertyId, lekkiProperty);

        return lekkiProperty;
    }

    @Override
    public LekkiProperty findById(int lekkiPropertyId) {

        for (Map.Entry<Integer, LekkiProperty> propertyEntry : lekkiPropertyDb.entrySet()) {
            if (propertyEntry.getKey().equals(lekkiPropertyId)) return propertyEntry.getValue();
        }
        return null;
    }

    @Override
    public ArrayList<LekkiProperty> findAll() {

        return new ArrayList<LekkiProperty>(lekkiPropertyDb.values());
    }

    @Override
    public void update(LekkiProperty newLekkiProperty) {

        int lekkiPropertyId = newLekkiProperty.getPropertyId();
        for (Map.Entry<Integer, LekkiProperty> propertyEntry : lekkiPropertyDb.entrySet()) {
            if (lekkiPropertyId == propertyEntry.getKey()) {
                lekkiPropertyDb.put(lekkiPropertyId, newLekkiProperty);
            }
        }
    }
}
