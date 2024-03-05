package com.company.BinarySearchinJava;

public class ArrangingCoins {
    public static void main(String[] args) {
        int ans = arrangeCoins(1);
        System.out.println(ans);
    }
    static int arrangeCoins(int n) {
        int start = 1;
        int left = n;
        int end = n;
        while (start<=end){
            if(left >= start){
                left = left-start;
                start++;
            }else{
                return start-1;
            }
        }
        return start-1;
    }
}
