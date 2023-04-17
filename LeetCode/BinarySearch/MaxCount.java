package com.company.LeetCode.BinarySearch;


public class MaxCount {
    public static void main(String[] args) {
        int[] arr = {-4, -3, -2, -1, -1, 1, 2, 3, 5, 7, 8, 9};
        int count = maximumCount(arr);
        System.out.println(count);
    }

    public static int maximumCount(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (nums[mid] >= 0 && nums[mid - 1] < 0) {
                return Math.max(mid,(nums.length)-mid);
            }
            else if(nums[mid] < 0){
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
}
