package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ArrayList - When we dont know the number of rows or columns or we want them to be dynamic we use arraylist
        ArrayList<Integer> arr = new ArrayList<>(10);
        // Adding elements in ArrayList
        arr.add(24);
        arr.add(10);
        arr.add(200);
        System.out.println(arr);
        // Checking elements if available or not
        System.out.println(arr.contains(24));
        // Setting value in ArrayList
        arr.set(0,12);
        System.out.println(arr);
        // Removing value in ArrayList
        arr.remove(2);
        // Getting  value from arraylist (Indexing will not work here)
        System.out.println(arr.get(0));
        // MultiDimensional ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(); //Initialisation of the Entire Arraylist
        // Adding elements in multidimensional arraylist
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>()); // Initialisation of the ArrayList inside of ArrayList
        }
        // Adding elements in MultiDimensional ArrayList
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
