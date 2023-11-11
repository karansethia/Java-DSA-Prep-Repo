package com.company.BinarySearchinJava;

public class FindinMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int peakIndex = binaryPeakSearch(arr);
        System.out.println(peakIndex);
        int ans = binarySearch(arr,3,0,peakIndex);
//        System.out.println(ans);
        if(ans==-1){
            ans = binarySearch(arr,3,peakIndex+1,arr.length-1);

        }
        System.out.println(ans);

    }
    static int binaryPeakSearch(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid] < arr[mid+1]){
                //in ascending part
                start = mid+1;
            }else if(arr[mid] > arr[mid+1]){
                // in descending part
                end = mid;
            }else{
                return mid;
            }
        }
        return start;
    }

    static int binarySearch(int[] arr,int target, int start, int end){
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end -start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target > arr[mid]){
                    start = mid+1;
                }else if(target < arr[mid]){
                    end = mid-1;
                }
            }else{
                if(target > arr[mid]){
                    end = mid -1;
                }else if(target < arr[mid]){
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
