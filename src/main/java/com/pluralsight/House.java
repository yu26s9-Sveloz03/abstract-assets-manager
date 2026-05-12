package com.pluralsight;

public class House extends Asset{

    private String address;
    private int condition;
    //1 - excellent, 2 - good, 3 - fair, 4 - poor
    private int squareFoot;
    private int lotSize;

    public House() {}

    @Override
    public double getValue() {
        double value = 0;
        if (getCondition() == 1) {
            value = 180 * getSquareFoot();
        } else if (getCondition() == 2){
            value = 130 * getSquareFoot();
        } else if (getCondition() == 3) {
            value = 90 * getSquareFoot();
        } else if (getCondition() == 4) {
            value = 80 * getSquareFoot();
        }
        value += 00.25 * getLotSize();
        return value;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
}
