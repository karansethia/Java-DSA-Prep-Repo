package com.company;
// Ques Link : https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class InifiniteArray {
    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9, 10, 90, 100, 130,
                140, 160, 170};
        int ans = chunkSize(arr, 10);
        System.out.println(ans);
    }
    static int chunkSize(int[] arr, int target){
        int start = 0;
        int end = 1;

        while(target > arr[end]){
            int newStart = end + 1;
            // doubling the box value
            end = end + (end - start +1);  // end = previous end + sizeofbox*2
            start = newStart;
        }
        return binarySearch(arr, target,start,end);


    }

    static int binarySearch(int[] arr, int target,int start,int end){
        while(start<=end) {
            //to find the middle element, mid=s+e/2 but s+e may exceed int range so we use this
            int mid = start + (end - start) / 2;
            // checking conditions
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        // element does not exist
        return -1;
    }
}
