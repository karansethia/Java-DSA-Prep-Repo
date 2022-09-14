package com.company.LeetCode;

public class RotatedBSDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int ans = search(arr,6);
        System.out.println(ans);
    }
    //this will not work in duplicate values
    static int search(int[] nums, int target){
        int pivot = pivot(nums);
        if(pivot == -1){
            //nums is sorted and not rotated, just apply normal Binary Search
            return binarySearch(nums,target,0, nums.length-1);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        return binarySearch(nums,target,pivot+1, nums.length-1);

    }
    static int binarySearch(int[] arr, int target, int start, int end){
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
    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            //case1
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1] && mid < end){
                return mid;
            }
            if(arr[mid]<arr[mid-1]&& mid>start){
                return mid-1;
            }
//            if(arr[mid]<=arr[start]){     => this will fail because of duplicates you cant compare
//                end = mid -1;
//            } else{
//                start = mid+1;
//            }
            // to resolve this just skip all the duplicates (if start=mid=end then skip
            // them unless they are also pivot)
            if(arr[start] == arr[mid] && arr[end] == arr[mid]){
                // checking if start is pivot or not
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                // checking if end is pivot or not
                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid]>arr[end]){
                start = mid+1;
            }
            else{
                end =mid -1;
            }

        }
        return -1;
    }
}
