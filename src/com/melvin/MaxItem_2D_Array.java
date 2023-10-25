package com.melvin;

public class MaxItem_2D_Array {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,34},
                {4,5,6,7},
                {7,8,9,222,},
                {18,1234}
        };
        int ans = max(arr);
        System.out.println(ans);
    }

    static int max(int[][] arr){
        int maximum = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(maximum<arr[row][col]){
                    maximum = arr[row][col];
                }
            }
        }
        return maximum;
    }
}
