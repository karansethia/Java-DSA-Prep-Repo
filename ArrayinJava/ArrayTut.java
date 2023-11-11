package com.company.ArrayinJava;

import java.util.Arrays;

public class ArrayTut {
    public static void main(String[] args) {
        System.out.println("Arrays Tutorial");

        //declaration and initialization
        int[] arr = {1,3,5,22,54,52};
        System.out.println(Arrays.toString(arr));

        // or for in loop
        for (int num: arr) {
            System.out.print(num + " ");
        }
    }
}
