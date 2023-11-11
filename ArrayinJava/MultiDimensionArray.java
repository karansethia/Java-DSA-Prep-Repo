package com.company.ArrayinJava;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declaration
        int[][] arr = new int[3][]; //Adding the number of rows in declaration is mandatory
        int [][] newarr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int[] ar: newarr) {
            System.out.println(Arrays.toString(ar));
        }
        //input
        int[][] myarray = new int[3][3];
        // myarray.length will return the number of rows

        // starting the loop with each row
        for(int row = 0; row < myarray.length; row++){
            //looping from the column of each row
            for (int i = 0; i < myarray[row].length; i++) {
                myarray[row][i] = sc.nextInt();
            }
        }
        for (int[] ar: myarray) {
            System.out.println(Arrays.toString(ar));
        }
    }
}
