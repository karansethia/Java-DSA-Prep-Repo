package com.company;

import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("LowerCase");
        }
        else if(ch >= 'A' && ch <= 'Z'){
            System.out.println("UpperCase");
        }
        else{
            System.out.println("Not an alphabet");
        }


    }
}
