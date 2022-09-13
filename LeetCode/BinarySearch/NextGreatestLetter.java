package com.company.LeetCode.BinarySearch;
// Ques Link : https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class NextGreatestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char ans = NGS(letters,'a');
    }
    static char NGS(char[] letters,char target){

        int start = 0;
        int end = letters.length -1;
        int count = 0;
        while(start<=end) {

            int mid = start + (end - start) / 2;
            count++;
            // checking conditions
            if (target < letters[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return letters[start % letters.length];
    }
}
