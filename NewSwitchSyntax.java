package com.company;

import java.util.Scanner;

public class NewSwitchSyntax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        switch(fruit){
            case "Mango":
                System.out.println("Best fruit you can have");
            case "Apple":
                System.out.println("Most Healthy Fruit");
            case "Banana":
                System.out.println("Gym person's best buddy");
                break;
            default:
                System.out.println("You really should try some good fruits");
        }
/*
      Works only on Java JDK version 13 and above
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("please enter a valid fruit");
        }
*/

    }
}
