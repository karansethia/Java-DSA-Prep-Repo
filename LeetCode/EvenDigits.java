package com.company.LeetCode;

public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {24,123,2,1234};
        EvenDig(arr);
    }
    static void EvenDig(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int num = arr[i];
            while(num>0){
                num = num / 10;
                count++;
            }
            if(count % 2 ==0){
                System.out.println(arr[i]+ " has even digits" );
            }
            else{
                System.out.println(arr[i]+ " has odd digits" );
            }
        }
    }
}
