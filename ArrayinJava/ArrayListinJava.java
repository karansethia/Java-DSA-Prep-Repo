package com.company.ArrayinJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListinJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(24);
        list.add(10);
        list.add(2000);
        list.add(12);
        list.add(10);
        System.out.println(list);
        System.out.println(list.contains(12));
        list.set(4,11);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        
        //input
        ArrayList<Integer> list1 = new ArrayList<>(10);
        for (int i = 0; i < 5; i++) {
            list1.add(sc.nextInt());
        }
        System.out.println(list1);
        // accesing via index
        for (int i = 0; i < 5; i++) {
            System.out.println(list1.get(i));
//            System.out.println();
        }
    }
}
