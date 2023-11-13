package com.company.StringsinJava;

public class PrettyPrinting {
    public static void main(String[] args) {
        float nums = 12.3553f;
        System.out.printf("Formatted num is : %.2f \n",nums);  // %.<number-of-decimal-places>f
        System.out.printf("Pie till 5 digits : %.5f \n",Math.PI);
        System.out.printf("%s is the best car made by %s", "Aventador","Lamborghini");
    }
}
