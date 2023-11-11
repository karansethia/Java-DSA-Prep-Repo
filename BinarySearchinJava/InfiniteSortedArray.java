package com.company.BinarySearchinJava;

import java.util.Arrays;

public class InfiniteSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,3,7,8,9,11,14,16,18,19,20,26,29,32,35,39,41,48,56,58,63,69,72};
        int ans = createRange(arr,56);
        System.out.println(ans+" "+arr[ans]);
    }
    static  int createRange(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(arr[end] < target){
            int newStart = end+1;
            end = end + (end-start+1)*2;
            start = newStart;
        }
        return binarysearch(arr,target, start, end);
    }
    static int binarysearch(int[] arr,int target, int start, int end){
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
