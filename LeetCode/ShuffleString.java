package com.company.LeetCode;
// Ques Link : https://leetcode.com/problems/shuffle-string/

public class ShuffleString {
    public static void main(String[] args) {
        String str = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String ans = restoreString(str,indices);
        System.out.println(ans);

    }
    static String restoreString(String s, int[] indices){
/*      We are going to manually sort the array and whatever index changes with
        the indices array same change will be applied to the string
        so that the string shuffles with the array
 */
        return s;
    }
}
