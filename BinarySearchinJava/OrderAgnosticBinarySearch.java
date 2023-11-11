package com.company.BinarySearchinJava;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] descarr = {24,21,19,17,13,10,9,4,2,0,-1};
        int[] ascarr = {-2,0,4,7,9,12,23,27,34,56};
        System.out.println(orderagbinary(descarr, 17));
        System.out.println(orderagbinary(ascarr, 27));
    }
    static int orderagbinary(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end -start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target > arr[mid]){
                    start = mid+1;
                }else if(target < arr[mid]){
                    end = mid-1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid -1;
                }else if(target < arr[mid]){
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
