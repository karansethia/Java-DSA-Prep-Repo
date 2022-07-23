package com.company;

public class Shadowing {
    String name= "Outer Karan";
    public void Name(){
        String name = "Inner Karan";
        System.out.println(name);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        new Shadowing().Name(); /* Use this syntax for using
         both local and global variable of the same name
         if there is a case of shadowing and "this" keyword with the variable name for global variable
    */
    }
}
