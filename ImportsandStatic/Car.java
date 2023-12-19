package com.company.ImportsandStatic;

public class Car {

        String name;
        String engine;
        static boolean isReleased;
        public Car(String name, String engine) {
            this.name = name;
            this.engine = engine;
            Car.isReleased = true;
        }
        public void printObj(){
            System.out.println("name : "+ this.name+", \nengine : "+this.engine);
        }
}
