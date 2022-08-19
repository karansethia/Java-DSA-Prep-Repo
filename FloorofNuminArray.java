package com.company;
// Floor is the greatest number smaller or equal to the target element
public class FloorofNuminArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,12};
        int ans = FloorofTarget(arr, 0);
        System.out.println(ans);
    }
    static int FloorofTarget(int[] arr, int target){
        // if target is the smaller than the smallest element of the array
        if(target < arr[0]){
            return -1;
        }
        int start = 0;
        int end = arr.length -1;
        int count = 0;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            count++;
            // checking conditions
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            }
            else{
                System.out.println(count);
                return arr[mid];
            }
        }
        return arr[end];
    }
}
