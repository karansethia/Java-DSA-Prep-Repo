package com.company.ImportsandStatic;

public class Main {
    public static void main(String[] args) {
        Car mustang = new Car("Ford Mustang GT500","V8");
        Car Porsche = new Car("Porsche Cayenne Turbo","V8");
        mustang.printObj();
        System.out.println(mustang.isReleased);
        System.out.println(Porsche.isReleased);

    }

    // this method is not dependent on the object
    static void message(){
        // cant use this because it requires instantiation hence the error
//        greeting();

        // But once the reference has been created it will work
        Main fn = new Main();
        fn.greeting();
    }

    // this method is dependent on the object it is instantiated from
    void greeting(){
        System.out.println("Hello World");
    }

}
