package com.company;

import java.util.Arrays;

public class SortedMatrixBS {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(Arrays.toString(search(matrix,6)));
    }
    // searching in the row for the remaining rows after ignoring step
    static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target){
        while(colStart <= colEnd){
            int mid = colStart + (colEnd - colStart)/2;
            if (matrix[row][mid] == target) {
                return new int[]{row,mid};
            }
            if(matrix[row][mid] < target){
                colStart = mid+1;
            }
            else{
                colEnd = mid -1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix, int target){
        int row = matrix.length;
        int col = matrix[0].length; // to check if matrix is one dimension
        if(row == 1){
            return binarySearch(matrix,0,0,col-1,target);
        }

        int rStart = 0;
        int rEnd = row -1;
        int colMid = col/2;
        // running the loop till two rows are remaining
        while(rStart < (rEnd-1)){
            int mid = rStart + (rEnd - rStart)/2;
            if(matrix[mid][colMid] == target){
                return new int[]{mid,colMid};
            }if(matrix[mid][colMid] < target){
                rStart = mid;
            }
            else{
                rEnd = mid;
            }
        }
        // after loop has ended we now have two rows
        // check whether the target is in the middle column
        if(matrix[rStart][colMid] == target){
            return new int[]{rStart,colMid};
        }
        if(matrix[rStart+1][colMid] == target){    // second row
            return new int[]{rStart+1,colMid};
        }
        // search in 1st half
        if (target <= matrix[rStart][colMid - 1]) {
            return binarySearch(matrix, rStart, 0, colMid-1, target);
        }
        // search in 2nd half
        if (target >= matrix[rStart][colMid + 1] && target <= matrix[rStart][col - 1]) {
            return binarySearch(matrix, rStart, colMid + 1, col - 1, target);
        }
        // search in 3rd half
        if (target <= matrix[rStart + 1][colMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, colMid-1, target);
        } else {
            return binarySearch(matrix, rStart + 1, colMid + 1, col - 1, target);
        }

    }
}
