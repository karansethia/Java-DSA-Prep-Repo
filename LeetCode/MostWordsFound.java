package com.company.LeetCode;
// Ques Link : https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/

import java.util.Arrays;

public class MostWordsFound {
    public static void main(String[] args) {
        /*
        Logic: We traverse into the string, find the sentence length by
         splitting it into array of words and getting length of that array
         */
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int max = (sentences[0].split(" ").length);
        for (int i = 0; i < sentences.length; i++) {
        //    countw[i] = sentences[i].split(" ").length;
            if(max < sentences[i].split(" ").length){
                max = sentences[i].split(" ").length;
            }
        }
        System.out.println(max);

    }
}
