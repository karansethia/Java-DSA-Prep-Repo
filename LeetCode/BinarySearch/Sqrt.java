package com.company.LeetCode.BinarySearch;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }
    static int mySqrt(int x){
        if(x<=1){
            return x;
        }
        return BinarySearch(x);
    }
    static int BinarySearch(int x){
        int start = 0,end = x/2,mid,ans=0;
        long temp;

        while(start<=end){
            mid = start + (end-start)/2;
            temp = (long)mid*(long)mid;
            if(temp == x){
                return mid;
            }
            if(temp < x){
                ans = mid;
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
}
