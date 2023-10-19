package com.melvin;

import java.util.Scanner;

public class MultiDim_Arrays {
    public static void main(String[] args) {


        //int [][] arr = new int[3][3];

//        int [][] arr = {
//                {1,2,3}, // 0th Index
//                {4,5,}, // 1st Index
//                {6,7,8,9} // 2nd Index---> arr[2]={6,7,8,9}---->arr[2][0]=6
//        };


        int [][] arr = new int[3][2];

        Scanner sc = new Scanner(System.in);

        for (int row = 0; row < arr.length ; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length ; col++) {
                arr[row][col] = sc.nextInt();
            }
        }


    }
}
