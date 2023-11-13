package com.company.StringsinJava;

public class StringTut {
    public static void main(String[] args) {
        String a = "Karan";
        String b = "Karan";  // => both a and b are pointing at the same object because of string pool
        System.out.println(a==b);

        // but if we want them to point at different object of same value then :
        String name = new String("Karan");
        String anotherName = new String("Karan");  // name and anotherName pointing at different objects and will be outisde string pool
        System.out.println(name == anotherName);

        // for checking only values and not whether they ae pointing at same object or not then use .equals()
        System.out.println(name.equals(anotherName));
        System.out.println(new int[]{2,5,3,6,8});
    }
}
