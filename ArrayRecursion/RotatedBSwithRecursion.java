package com.company.ArrayRecursion;

public class RotatedBSwithRecursion {
    public static void main(String[] args) {
        int[] arr = {12,14,18,21,25,29,32,2,6,7,8,10};
        int ans = search(arr, 21, 0, arr.length-1);
        System.out.println(ans);
    }
    static int search(int[] nums, int target, int start, int end){

        int mid = start + (end-start)/2;
        if(nums[mid] == target){
            return mid;
        }
        if(nums[start] > nums[mid]){
            if(target >= nums[mid] && target <= nums[end]){
                return search(nums, target, mid,end);
            }else{
                return search(nums,target,0,mid-1);
            }
        }else if(nums[start] < nums[mid]){
            if(target >= nums[start] && target <= nums[mid]){
                return search(nums, target, start, mid);
            }else{
                return search(nums, target, mid+1, end);
            }
        }
        return -1;
    }
}
