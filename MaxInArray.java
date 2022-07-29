package com.company;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int maximum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maximum){
                maximum = arr[i];
            }
        }
        return maximum;
    }
}
