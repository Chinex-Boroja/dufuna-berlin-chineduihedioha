package com.dufuna.berlin.chineduihedioha.lekki.model;

import java.util.Objects;

public class LekkiProperty {

    private int propertyId;
    private String propertyAddress;
    private String propertyType;
    private int numberOfBedrooms;
    private int numberOfSittingRooms;
    private int numberOfKitchens;
    private int numberOfBathrooms;
    private int numberOfToilets;
    private String propertyOwner;
    private String description;
    private String validFrom;
    private String validTo;

    public LekkiProperty() {
    }

    public LekkiProperty(int propertyId, String propertyType, String propertyAddress) {
        setPropertyId(propertyId);
        setPropertyType(propertyType);
        setPropertyAddress(propertyAddress);
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public int getNumberOfSittingRooms() {
        return numberOfSittingRooms;
    }

    public void setNumberOfSittingRooms(int numberOfSittingRooms) {
        this.numberOfSittingRooms = numberOfSittingRooms;
    }

    public int getNumberOfKitchens() {
        return numberOfKitchens;
    }

    public void setNumberOfKitchens(int numberOfKitchens) {
        this.numberOfKitchens = numberOfKitchens;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public int getNumberOfToilets() {
        return numberOfToilets;
    }

    public void setNumberOfToilets(int numberOfToilets) {
        this.numberOfToilets = numberOfToilets;
    }

    public String getPropertyOwner() {
        return propertyOwner;
    }

    public void setPropertyOwner(String propertyOwner) {
        this.propertyOwner = propertyOwner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getValidTo() {
        return validTo;
    }

    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LekkiProperty that = (LekkiProperty) o;
        return propertyId == that.propertyId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(propertyId);
    }

    @Override
    public String toString() {
        return "LekkiProperty Details: [" + "Property id: " + propertyId +
                ", Property Address: " + propertyAddress +
                 ", Property Type: " + propertyType + ']';
    }
}
