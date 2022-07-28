package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Arraystut {
    public static void main(String[] args) {
        // syntax : datatype[] arrayName = new datatype[size];
        int[] arr = new int[5];
        System.out.println(arr[3]);
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        // alternate syntax for iterating in array
        for(int num : arr){
            System.out.print(num + " ");
        }
        // Another way to print string
        System.out.println(Arrays.toString(arr));

        System.out.println("testing");
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[1] = 12;
    }

}
