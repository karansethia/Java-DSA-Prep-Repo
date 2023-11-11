package com.company.BinarySearchinJava;

public class FloorofNum {
    public static void main(String[] args) {
        int[] arr = {2,4,6,12,14,16,18};
        int floor = binarysearch(arr,18);
        System.out.println(floor);
    }
    static int binarysearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target > arr[mid]){
                if(target < arr[mid+1]){
                    return arr[mid];
                }
                start = mid+1;
            }else if(target < arr[mid]){
                if(target > arr[mid-1]){
                    return arr[mid-1];
                }
                end = mid-1;
            }else{
                return arr[mid];
            }
        }
        return -1;
    }
}
