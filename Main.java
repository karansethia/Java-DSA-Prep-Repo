package com.company;

public class Main {

    public static void main(String[] args) {
	// Creating an array of students data by traditional methods
        int[] rollno = new int[5];
        int[] marks = new int[5];
        String[] name = new String[5];

        // But what if we wanted a data type where all the related data is combined rather than having a
        // seperate data stored for each of the property
        // Creating object from the class car
        Car mustang = new Car("Ford Mustang GT500","V8",2,80000);
//        mustang.seats = 1;
//        mustang.price = 80000;
//        mustang.engine = "V8";
//        mustang.name = "Ford Mustang GT500";
//        System.out.println(mustang);
        mustang.greeting();
        Car someCar = new Car();
        System.out.println(someCar.name);
    }
}
// creating a class
class Car {
    String name;
    String engine;
    int seats;
    double price;
    // constructor
    Car(String name,String engine,int seats,int price){
        this.name = name;
        this.engine = engine;
        this.seats = seats;
        this.price = price;
        // caling a function inside of another constructor
        this.message();
    }
    Car(){
    // calling constructor inside of another constructor
        this("Ford GT","V6",2,155000);
    }
    void message(){
        System.out.println("Keep roaring that engine");
    }
    void greeting(){
        System.out.println("The name of the car is "+this.name);
    }
}
