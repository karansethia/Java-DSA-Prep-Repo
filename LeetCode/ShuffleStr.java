package com.company.LeetCode;

public class ShuffleStr {
    public static void main(String[] args) {
        String s="art";
        int [] arr = {1,0,2};
        String ans=  restoreString(s,arr);
        System.out.println(ans);
    }
    static String restoreString(String s, int[] indices) {
        StringBuilder str = new StringBuilder(s);
        for(int i =0; i < indices.length; ++i)
            str.setCharAt(indices[i],s.charAt(i));
        return str.toString();
    }
}
