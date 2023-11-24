package com.company.ArrayRecursion;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr = {3,6,9,10,14,18,21,32};
     boolean isSorted = sorted(arr, 0);
        System.out.println("ans: " + isSorted);
    }
    static boolean sorted(int[] nums, int index){
        if(index == nums.length-1){
            return true;
        }
        return nums[index] < nums[index+1] && sorted(nums, index+1);

    }
}
