package com.company.BinarySearchinJava;

public class RotatedSortedwithDuplicates {
    public static void main(String[] args) {
        int[] arr = {2,9,2,2,2};
        int pivot = search(arr);
        System.out.println(pivot);
        int target = 0;
        if(target < arr[0]){
            int ans = binarySearch(arr, target, pivot+1,arr.length-1);
            System.out.print(ans);
        }else{
            int ans = binarySearch(arr, target, 0,pivot);
            System.out.println(ans);
        }
    }
    static int search(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid] > arr[mid+1]){  //mid<end condition because we if mid is already at end mid+1 will give array out of bounds error
                return mid;
            }
            if(mid>start && arr[mid-1]>arr[mid]){
                return mid -1;
            }
            // if elements at start mid and end are equal then skip
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                //but we check of start is pivot or not
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start = start+1;
                // also we check if end is pivot
                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end = end-1;
            }else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    static int binarySearch(int[] arr,int target,int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target > arr[mid]){
                start = mid+1;
            }else if(target < arr[mid]){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
