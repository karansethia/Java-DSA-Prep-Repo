package com.company.LeetCode;
// Ques Link : https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/
public class PeakIndexInMountainArray {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,4,2,1,-2};
       int ans = peakIndex(arr);
        System.out.println(ans);

    }
    static int peakIndex(int[] arr){
        // LOGIC : we will check if the middle element is greater or smaller
        // than prev and next element respectively and acc to that we will be able to tell
        // which part of array is acending and descending and we will continue the loop till
        // start and end pointers point at the same index and that will give us the max/peak
        int start = 0;
        int end = arr.length -1;
        while(start<end) {
            //to find the middle element, mid=s+e/2 but s+e may exceed int range so we use this
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1] ){
                // you are in decreasing part
                end = mid;
            }
            else{
                // you are in ascending part
                start = mid + 1; // mid + 1 is obv greater than mid
            }
        }
        return start; // or end or mid since they are all pointing at the same element
    }
}
