package com.company.Recursion;

public class FibowithGoldenRatio {
    public static void main(String[] args) {
        System.out.println(fiboNum(8));
    }
    static int fiboNum(int num){
    double outside = (double)1/(Math.sqrt(5)*Math.pow(2,num));
    double inside = (Math.pow((1+Math.sqrt(5)),num)-Math.pow((1-Math.sqrt(5)),num));
    return (int)(inside*outside);
    }
}
