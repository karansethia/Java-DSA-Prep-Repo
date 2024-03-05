package com.company.BinarySearchinJava;

//Ques: https://leetcode.com/problems/valid-perfect-square/description/

public class IsPerfectSquare {
    public static void main(String[] args) {
        boolean isSquare = isPerfectSquare(808201);
//        boolean isSquare = isPerfectSquare(625);
        System.out.println(isSquare);
    }
    static boolean isPerfectSquare(int num) {
        if(num == 1){
            return true;
        }
        int start = 1;
        int end = (num/2);
        while(start <= end){
            int mid = start + (end-start)/2;
            long sqr = mid*mid;
            if(sqr == num){
                return true;
            }else if(sqr > num){
                end=(int)mid-1;
            }else{
                start = (int) mid+1;
            }
        }
        return false;
    }
}
