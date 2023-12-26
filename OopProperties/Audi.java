package com.company.OopProperties;


    public class Audi extends RoadVehicle{
        String name;
        String engine;
        int bhp;
        public Audi(){
            this.name="R8";
            this.engine="V10";
            this.bhp = 656;
        }
        public Audi(String name, String engine, int bhp) {
            this.name = name;
            this.engine = engine;
            this.bhp = bhp;
        }

        public Audi(String type, int numberofWheels, String name, String engine, int bhp) {
            super(type, numberofWheels); // calling the parent class constructor
            this.name = name;
            this.engine = engine;
            this.bhp = bhp;
        }
        public void printObj(){
            System.out.println(" - Vehicle Type : "+this.type);
            System.out.println(" - Number of Wheels : "+this.numberofWheels);
            System.out.println(" - Name : "+this.name);
            System.out.println(" - Engine : "+this.engine);
            System.out.println(" - Horsepower : "+this.bhp);
        }


    }

