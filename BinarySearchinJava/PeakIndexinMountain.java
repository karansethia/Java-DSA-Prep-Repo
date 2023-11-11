package com.company.BinarySearchinJava;

public class PeakIndexinMountain {
    public static void main(String[] args) {
        int[] arr = {0,2,4,5,8,9,3,1};
        int ans = binarySearch(arr);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid] < arr[mid+1]){
                //in ascending part
                start = mid+1;
            }else if(arr[mid] > arr[mid+1]){
                // in descending part
                end = mid;
            }else{
                return mid;
            }
        }
        return start;
    }
}
