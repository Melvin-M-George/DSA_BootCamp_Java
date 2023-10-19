package com.melvin;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDim_Arrays {
    public static void main(String[] args) {


        //int [][] arr = new int[3][3];

//        int [][] arr = {
//                {1,2,3}, // 0th Index
//                {4,5,}, // 1st Index
//                {6,7,8,9} // 2nd Index---> arr[2]={6,7,8,9}---->arr[2][0]=6
//        };


        int [][] arr = new int[3][3];

        Scanner sc = new Scanner(System.in);
        // Input
        for (int row = 0; row < arr.length ; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length ; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        // Output
//        for (int row = 0; row < arr.length ; row++) {
//            // for each col in every row
//            for (int col = 0; col < arr[row].length ; col++) {
//                System.out.print(arr[row][col] + " " );
//            }
//            System.out.println();
//        }

//        for (int row = 0; row < arr.length ; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        for(int[] element: arr){
            System.out.println(Arrays.toString(element));
        }






    }
}
