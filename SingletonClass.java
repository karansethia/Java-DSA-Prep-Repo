package com.company;

public class SingletonClass {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
        System.out.println(obj.name);
        System.out.println(obj2.name);
        System.out.println(obj3.name);
    }
}
class Singleton{
    String name;

    private Singleton() {
        this.name = "Karan";
    }
    private static Singleton instance;
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
