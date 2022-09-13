package com.company.LeetCode.BinarySearch;

import java.util.Arrays;

public class SearchOccurrence {
    public static void main(String[] args) {
        int[] nums = {5,7,7,7,7,8,8,10};
        int[] arr = searchRange(nums,7);
        System.out.println(Arrays.toString(arr));

    }
    static int[] searchRange(int[] nums,int target){
        int[] ans = {-1,1};

        // check for first occurence of target
        int start = search(nums, target, true);
        // check for last occurence of target
        int end = search(nums, target,false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    static int search(int[] arr, int target, boolean findStart){
        int ans = -1;
        int start = 0;
        int end = arr.length -1;
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
                ans = mid;
                if(findStart){
                    end = mid -1;  // To check if more target lies before current position
                }
                else{
                    start = mid +1; // To check if more target lies after current position
                }
            }
        }
        return ans;
    }
}
