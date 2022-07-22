package com.company;

public class CountingOccurrence {
    public static void main(String[] args) {
        int n = 13432834;
        int count = 0;
        while(n>0){
            int rem = n % 10;
            n = n/ 10;
            if(rem == 3){
                count++;
            }
        }
        System.out.println(count);
    }
}
