package com.company;

public class LinearSearchAlgo {
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,43,21};
        System.out.println(linearSearch(nums,43));
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;   // Returns -1 if array is empty
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == target){
                return index;    // return if and only if the element is found
            }
        }
        return -1;   // default return statement if no element is found
    }
}
