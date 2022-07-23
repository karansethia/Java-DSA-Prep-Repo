package com.company;

public class VarArgs {
    public static void main(String[] args) {
        int total = sum(1,2,3,4);
        System.out.println(total);
    }
    static int sum(int ...v){  // using VarArgs ( int ...v )
        int sum = 0;
        for(int i = 0; i<v.length; i++){
            sum = sum + v[i];
        }
        return sum;
    }
}
