package com.company;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] myarray = {24,21,18,15,12,11,9,8,3,2,-10};
        int ans = orderAgnosticBS(myarray,-10);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        // to find whether the given array is ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start<=end) {

            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }

        }
        // element does not exist
        return -1;
    }
}
