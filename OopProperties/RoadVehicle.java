package com.company.OopProperties;

public class RoadVehicle {

        String type;
        int numberofWheels;
        RoadVehicle(){
//           this("Car",4);
            this.type = "Car";
            this.numberofWheels=4;
        }
        public RoadVehicle(String type, int numberofWheels) {
            this.type = type;
            this.numberofWheels = numberofWheels;
        }
        public void printVehicle(){
            System.out.println(" - Vehicle Type : "+this.type);
            System.out.println(" - Number of Wheels : "+this.numberofWheels);
        }

    }

