package com.company;

public class ChangingValue {
    public static void main(String[] args) {


        //Complex or Non-Primitive data type -> Pass by value of reference
        int arr[] = {1,2,3,4};
        arrChange(arr);
        System.out.println(arr[0]);


        //Primitive Data type -> Pass by value only
        int a = 20;
        intChange(a);
        System.out.println(a);


        // String is also treated as a Primitve Data type
        String name = "Karan";
        nameChange(name);
        System.out.println(name);
    }
    static void arrChange(int[] myArr){
        myArr[0] = 99;
    }
    static void intChange(int value){
        value = 40;
    }
    static void nameChange(String myName){
        myName = "Kartik";
    }
}
