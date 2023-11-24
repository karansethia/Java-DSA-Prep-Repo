package com.company.ArrayRecursion;

public class RecursiveLinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,1,6,12,5,15,24,17,55,34,28};
        int index = search(arr, 0, 28);
        System.out.println(index);
    }
    static int search(int[] nums,int index, int target){
     if(index == nums.length){
         return -1;
     }
     if(nums[index] == target){
         return index;
     }
     return search(nums,index+1,target);
    }
}
