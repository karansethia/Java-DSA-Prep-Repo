package com.company.LeetCode;
// Ques Link : https://leetcode.com/problems/find-in-mountain-array/
public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int ans = searchElement(arr,1);
        System.out.println(ans);
    }

    static int searchElement(int[] arr, int target) {
        int start = 0;
        int end = peakIndex(arr);
        // to find whether the given array is ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        // element does not exist
        return -1;
    }

    static int peakIndex(int[] arr) {
        // LOGIC : we will check if the middle element is greater or smaller
        // than prev and next element respectively and acc to that we will be able to tell
        // which part of array is acending and descending and we will continue the loop till
        // start and end pointers point at the same index and that will give us the max/peak
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            //to find the middle element, mid=s+e/2 but s+e may exceed int range so we use this
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in decreasing part
                end = mid;
            } else {
                // you are in ascending part
                start = mid + 1; // mid + 1 is obv greater than mid
            }
        }
        return start; // or end or mid since they are all pointing at the same element
    }
}
