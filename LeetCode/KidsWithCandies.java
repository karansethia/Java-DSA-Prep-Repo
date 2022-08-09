package com.company.LeetCode;
// Ques Link : https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
import java.util.Arrays;

public class KidsWithCandies {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int n = candies.length;
        int extraCandies = 1;
        boolean[] isMax = new boolean[n];
        int maximum = candies[0];
        for (int candy : candies) {
            if (candy > maximum) {
                maximum = candy;
            }
        }
        for(int i = 0;i<n;i++){
            candies[i] += extraCandies;
            if(candies[i]>=maximum){
                isMax[i] = true;
            }
            else{
                isMax[i] = false;
            }
        }
        System.out.println(Arrays.toString(isMax));
    }
}
