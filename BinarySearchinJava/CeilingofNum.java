package com.company.BinarySearchinJava;

public class CeilingofNum {
    public static void main(String[] args) {
        int[] arr = {2,4,6,12,14,16,18};
//        int ceiling = ceilingofTarget(arr,5);
        int ceiling2 = binarySearch(arr,25);
        System.out.println(ceiling2);
//        System.out.println("op: "+ceiling);
    }
    static int ceilingofTarget(int[] arr,int target){
        // if target is larger than the largest element
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length -1;
        int count = 0;
        while(start<=end) {

            int mid = start + (end - start) / 2;
            count++;
            // checking conditions
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            }
            else{
                System.out.println("op count:"+count);
                return arr[mid];
            }
        }
        return arr[start];
    }

    // another way of doing
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        if(target>arr[end] || target < arr[start]){
            return -1;
        }
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target > arr[mid]){
                if(target < arr[mid+1]){
                    return arr[mid+1];
                }
                start = mid+1;
            }else if(target < arr[mid]){
                if(target > arr[mid-1]){
                    return arr[mid];
                }
                end = mid-1;
            }else{
                return arr[mid];
            }
        }
        return -1;
    }
}
