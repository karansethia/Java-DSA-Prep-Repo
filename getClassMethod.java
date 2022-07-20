package com.company;
import java.util.*;

public class getClassMethod {
    public static void main(String[] args) {
        int num = 24;
        String str = "Karan";
        byte b = 5;
        double d = 4.22321234d;
        float f = 3.14f;
        System.out.println(((Object)num).getClass().getSimpleName());
        System.out.println(((Object)b).getClass().getSimpleName());
        System.out.println(((Object)d).getClass().getSimpleName());
        System.out.println(((Object)f).getClass().getSimpleName());
        System.out.println(str.getClass().getSimpleName());
    }
}
