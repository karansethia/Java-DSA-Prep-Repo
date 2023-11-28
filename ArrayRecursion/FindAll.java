package com.company.ArrayRecursion;

import java.util.ArrayList;

public class FindAll {
    public static void main(String[] args) {
        int[] nums = {2,1,24,6,12,5,15,24,24,17,55,34,24,28};
        search(nums, 0, 24);
        System.out.println(arr);

    }
     static ArrayList<Integer> arr = new ArrayList<>();
    static void search(int[] nums, int index, int target){

        if(index == nums.length){
            return;
        }
        if(nums[index] == target){
            arr.add(index);
//            return index;
        }
       search(nums,index+1,target);
    }
}
