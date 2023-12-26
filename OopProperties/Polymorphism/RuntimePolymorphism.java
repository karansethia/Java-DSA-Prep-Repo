package com.company.OopProperties.Polymorphism;

public class RuntimePolymorphism {

}
class A{
    int a;
    int b;

    void sum(){
        System.out.println(a+b);
    }
}class B extends A{
    int a;
    int b;

    @Override // this is called annotation (used for checking purposes - basically if sum is
        // not overriding or being overridden this will throw an error
    void sum(){
        System.out.println(a+b);
    }
}
