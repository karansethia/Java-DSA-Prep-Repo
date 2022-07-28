package com.company;

import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // A 2-D Array
        /*
        1 2 3
        4 5 6
        7 8 9
         */
        //syntax
        int[][] arr= new int[3][2]; //adding number of rows is mandatory
        // hard syntax
        int [][] arr2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(arr.length); // will give number of rows
        // input for 2-D array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
    }
}
