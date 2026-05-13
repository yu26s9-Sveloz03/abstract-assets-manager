package com.pluralsight;

import java.util.ArrayList;

public class Main {

    static void main() {
        ArrayList<Asset> assets = new ArrayList<Asset>();

        House myHouse = new House("My House","01/01/2003",150000,"1224 Walton Ave",2,3000,1000);
        House vacationHome = new House("Vacation Home","07/03/2015",300000,"123 Los Americas",1,4500,100);

        Vehicle myCar = new Vehicle("car","05/12/2025",30000,"Nissan Altima",2021,20000);
        Vehicle myTruck = new Vehicle("truck","10/28/2012",15000,"Ford Explorer",2001,60000);

        assets.add(myHouse);
        assets.add(vacationHome);
        assets.add(myCar);
        assets.add(myTruck);

        for (Asset asset : assets) {
            System.out.printf("Description: %s\n" +
                    "Date Acquired: %s\n" +
                    "Original Cost: %.2f\n" +
                    "Current Value: %.2f\n",asset.getDescription(),asset.getDateAcquired(),asset.getOriginalCost(),asset.getValue());
            if ( asset instanceof House) {
                System.out.printf("Address: %s\n\n",((House) asset).getAddress());
            } else if (asset instanceof Vehicle) {
                System.out.printf("Year: %d\n" +
                        "Make & Model: %s\n\n",((Vehicle) asset).getYear(),((Vehicle) asset).getMakeModel());
            }
        }
    }
}
