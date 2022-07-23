package com.company;

public class Functions {
    public static void main(String[] args) {
        String str = Greet();
        System.out.println(str);
        int sum = Sum(10,20);
        System.out.println(sum);
        str = Greet2("Karan");
        System.out.println(str);
        //variables we declare in function definition are arguments
        //variables we give to a function in function call are parameters
    }
    static String Greet(){
       String greet = "Hello!";
       return greet;
    }
    static int Sum(int a,int b){
        return a+b;
    }
    static String Greet2(String name){
        String message = "Good Morning " + name;
        return message;
    }
}
