package com.melvin;

import java.util.Arrays;

public class SearchIn_2D_Array {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,34},
                {4,5,6,7},
                {7,8,9,2,},
                {18,12}};
        int target = 2;
        int [] ans = search(arr,target);//format of return value {row,col}
        System.out.println(Arrays.toString(ans));

    }

    static int[] search(int [][] arr, int target){
        for (int row = 0; row< arr.length; row++){
            for(int col = 0; col< arr[row].length; col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
