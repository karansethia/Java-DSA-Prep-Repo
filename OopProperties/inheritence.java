package com.company.OopProperties;

public class inheritence {
    public static void main(String[] args) {
//        Audi R8= new Audi();
//        System.out.println(R8.type);
//        System.out.println(R8.numberofWheels);
        Audi quattro = new Audi("Car",4,"Quattro", "V8",500);
        System.out.println("Car Details");
        quattro.printObj();
        System.out.println("Vehicle Details");
        quattro.printVehicle();

        // trying to access memebers of child via parent reference
        RoadVehicle car = new Audi("Car",4,"R8","v10",750);
//        System.out.println(car.name); // cant access because the reference type is of RoadVehicle which cant access the members of child (Audi)
    }
}


