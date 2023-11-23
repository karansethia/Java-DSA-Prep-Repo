package com.company.Patterns;

public class PatternOne {
    public static void main(String[] args) {
        /*
        Pattern :
            *****
            *****
            *****
            *****
            *****
        */
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
