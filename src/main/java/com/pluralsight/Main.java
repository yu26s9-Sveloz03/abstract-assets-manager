package com.pluralsight;

import java.util.ArrayList;

public class Main {

    static void main() {
        ArrayList<Asset> assets = new ArrayList<Asset>();

        House myHouse = new House();
        myHouse.setDescription("My house");
        House andyHouse = new House();
        andyHouse.setDescription("Andy's house");

        Vehicle myCar = new Vehicle();
        myCar.setDescription("My car");
        Vehicle myTruck = new Vehicle();
        myTruck.setDescription("My truck");

        assets.add(myHouse);
        assets.add(andyHouse);
        assets.add(myCar);
        assets.add(myTruck);

        for (Asset asset : assets) {
            System.out.println(asset.getDescription());
            System.out.println(asset.getDateAcquired());
            System.out.println(asset.getOriginalCost());
            System.out.println(asset.getValue());
        }
    }
}
