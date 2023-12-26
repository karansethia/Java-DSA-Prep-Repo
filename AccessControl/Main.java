package com.company.AccessControl;

public class Main {
    public static void main(String[] args) {
        A obj = new A(24, "Karan",new int[]{86,73,81});
       // obj.id; will give an error because id is private


        // using getter to get the value of id
        System.out.println(obj.getId());

//       using setter to set or change the value in private id
        obj.setId(23);
        System.out.println(obj.getId());
    }
}
