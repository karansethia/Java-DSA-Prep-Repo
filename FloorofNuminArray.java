package com.company;
// Floor is the greatest number smaller or equal to the target element
public class FloorofNuminArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,12};
        int ans = FloorofTarget(arr, 4);
        System.out.println(ans);
    }
    static int FloorofTarget(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        int count = 0;
        while(start<=end) {
            //to find the middle element, mid=s+e/2 but s+e may exceed int range so we use this
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
        // element does not exist
        //  System.out.println(count);
        return arr[end];
    }
}
