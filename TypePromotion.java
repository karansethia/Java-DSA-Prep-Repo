package com.company;

public class TypePromotion {
    public static void main(String[] args) {
        byte a = 40;
        byte b = 50;
        byte d = (byte) ((a*b)/100); // here d is promoted to int before we type cast it back to byte
                                    // because a*b exceeds the range of byte data type
    }
}
