package com.company.BinarySearchinJava;

public class SqrtwithBS {
    public static void main(String[] args) {
//        int x = 2147395599;
        int x = 4;
//        int x = 26;
        int ans = findSqrt(x);
        System.out.println(ans);
    }
    static int findSqrt(int x){
        double start = 1;
        double end = (x/2);
        while(start <= end){
            double mid =Math.floor(start + (end-start)/2);
            if((mid*mid) > x){
                end = mid;
            }
            if((mid*mid) <= x){
                double next = mid+1;
                if((next*next) > x){
                    return (int)(mid);
                }else if(next*next == x){
                    return (int)next;
                }else{
                    start = mid+1;
                }
            }
        }
            return -1;
    }
}
