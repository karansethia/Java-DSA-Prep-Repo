package com.company.ArrayRecursion;

import java.util.ArrayList;

public class FindAllwithArrayList {
    public static void main(String[] args) {
        int[] nums = {2,1,24,6,12,5,15,24,24,17,55,34,24,28};
        ArrayList<Integer> arr = search(nums, 0, 24);
        System.out.println(arr);

    }

    static ArrayList<Integer> search(int[] nums, int index, int target){
        ArrayList<Integer> arr = new ArrayList<>(){};
        if(index == nums.length){
            return arr;
        }
        //ans that is provided by the current running function
        if(nums[index] == target){
            arr.add(index);
//            return index;
        }
        ArrayList<Integer> ans = search(nums,index+1,target);
        arr.addAll(ans);
        return arr;
    }
}
