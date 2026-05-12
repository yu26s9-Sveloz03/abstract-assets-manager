package com.pluralsight;

public class Vehicle extends House{

    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle () {}

    @Override
    public double getValue() {
        double value = getOriginalCost();
        if (getYear() >= 0 && getYear() <= 3) {
            for (int i = 0; i < getYear(); i++) {
                value *= 00.97;
            }
        } else if (getYear() >= 4 && getYear() <= 6) {
            for (int i = 0; i < getYear(); i++) {
                value *= 00.94;
            }
        } else if (getYear() >= 7 && getYear() <= 10) {
            for (int i = 0; i < getYear(); i++) {
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
