package com.company;

import java.util.Scanner;

public class LinearRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: \n");
        String str = sc.next();
        System.out.print("Enter the character: \n");
        char ch = sc.next().charAt(0);
        System.out.print("Enter the range [lower and upper]: \n");
        int lower = sc.nextInt();
        int upper = sc.nextInt();

        System.out.println(search(str,ch,upper,lower));

    }
    static boolean search(String name,char target,int urange,int lrange){
        if(name.length() == 0){
            return false;
        }
        for (int i = lrange; i <= urange && i<name.length(); i++) {
            if(target == name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
