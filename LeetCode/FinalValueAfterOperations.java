package com.company.LeetCode;

public class FinalValueAfterOperations {
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            if(operations[i].equals("X++") || operations[i].equals("++X")){
                x = x+1;
            }
            else{
                x = x-1;
            }
        }
        System.out.println(x);
    }
}
