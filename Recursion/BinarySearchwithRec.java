package com.company.Recursion;

public class BinarySearchwithRec {
    public static void main(String[] args) {
        int[] nums = {1,3,8,11,13,16,23,25,29,32,43,55};
        int ans = binarySearch(nums,55,0,nums.length-1);
        System.out.println(ans);
    }
//    static int binarySearch(int[] nums,int target, int start, int end){
//        if(start > end){
//            return -1;
//        }
//        int mid = start + (end-start)/2;
//        if(target == nums[mid]){
//            return mid;
//        }
//        if(target > nums[mid]){
//             return binarySearch(nums,target,mid+1,end);
//        }
//        return binarySearch(nums, target,0,mid-1);
//    }
    static  int binarySearch(int[] nums,int target, int start, int end){
        if(start > end){
            return -1;
        }
        int ans = -1;
        int mid = start + (end-start)/2;
        if(target > nums[mid]){
            //go to right
            ans = binarySearch(nums,target,mid+1,end);
        }else if(target < nums[mid]){
            //go to left
            ans = binarySearch(nums,target,0,mid-1);
        }else{
            ans = mid;
        }
        return ans;
    }
}
