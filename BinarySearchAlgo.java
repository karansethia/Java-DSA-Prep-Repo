package com.company;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        int[] array = {-12,0,1,5,8,12,16,19,23,25};
        int ans = binarySearch(array,16);
        System.out.println(ans);
    }

    // returns index if found else -1
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        int count = 0;
        while(start<=end) {
            //to find the middle element, mid=s+e/2 but s+e may exceed int range so we use this
            int mid = start + (end - start) / 2;
            count++;
            // checking conditions
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            }
            else{
                System.out.println(count);
                return mid;
            }
        }
        // element does not exist
        System.out.println(count);
        return -1;
    }
}
