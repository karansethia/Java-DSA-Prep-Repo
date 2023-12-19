package com.company;

public class FinalizeMethod {
    public static void main(String[] args) {

    }
    class Car {
        String name;
        String engine;
        Car(String name, String engine){
            this.name = name;
            this.engine = engine;
            this.message();
        }
        void message(){
            System.out.println("{ name : "+this.name+",\n engine : "+ this.engine+"}");
        }

        @Override
        protected void finalize() throws Throwable { // this method is fired when object is about to be removed by garbage collector
            System.out.println("Object deleted");
        }
    }
}
