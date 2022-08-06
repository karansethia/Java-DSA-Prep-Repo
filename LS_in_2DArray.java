package com.company;

import java.util.Arrays;

public class LS_in_2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,10,3,4,56},
                {43,2,12,13,53},
                {25,63,1,33,7}
        };
        int target = 943;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int[][] arr,int target){
        int ans = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
