package com.company.Recursion;

public class ReverseofNum {
    public static void main(String[] args) {
        int number = 12321;
        int length = String.valueOf(number).length();
        long ans = reverse(number,length-1);
        System.out.println(number);
        System.out.println(ans);
        if(number == ans){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
    static long reverse(int n, int place){
        if(n%10 == n){
            return n;
        }
        long power = (long) Math.pow(10,place);
        return (n%10)*power+reverse(n/10,place-1);
    }
}
