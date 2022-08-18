package com.company;
// Ceiling of number means when we want to search an array element
// that is greater than or equal to the target element. Also it has to be the closest greatest
public class CeilingofNuminArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,12};
        int ans = ceilingofTarget(arr, 4);
        System.out.println(ans);
    }
    static int ceilingofTarget(int[] arr,int target){
       // if target is larger than the largest element
       if(target > arr[arr.length-1]){
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
        return arr[start];
    }
}
