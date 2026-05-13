package com.pluralsight;

public class Vehicle extends Asset{

    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle (String description, String dateAquired, double originalCost, String makeModel, int year, int odometer) {
        super(description,dateAquired,originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        int age = 2026 - getYear();
        double value = getOriginalCost();
        if (age >= 0 && age <= 3) {
            for (int i = 0; i < age; i++) {
                value *= 00.97;
            }
        } else if (age >= 4 && age <= 6) {
            for (int i = 0; i < age; i++) {
                value *= 00.94;
            }
        } else if (age >= 7 && age <= 10) {
            for (int i = 0; i < age; i++) {
                value *= 00.92;
            }
        } else {
            value -= 1000;
        }
        if (getOdometer() > 100000 && (!getMakeModel().contains("Honda") || !getMakeModel().contains("Toyota"))) {
            value *= 00.75;
        }
        return value;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}
