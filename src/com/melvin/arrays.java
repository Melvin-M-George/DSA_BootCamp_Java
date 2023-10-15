package com.melvin;

import java.util.Scanner;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Q:Store a roll number
//        int a = 19;

        //Q: Store a person's name
//        String name = "Melvin";
        //Q: Store 5 roll numbers

        //int [] roll_numbers = new int[5];
        //int [] rollNumbers = {1,2,3,4,5};
//         int [] rollNumbers; // Declaration--> Reference variable is getting defined in the stack
//        rollNumbers = new int[5]; // Initialization--> Actually object is being created in memory(heap memory)

//        String [] arr = new String[5];
//        System.out.println(arr[2]);

        //Array of Primitives
        /*
        
        int [] arr = new int[5];

         */
/*
        arr[0] = 23;
        arr[1] = 33;
        arr[2] = 43;
        arr[3] = 53;
        arr[4] = 63;

        System.out.println(arr[3]);
        Input using for loops
*/
        /*
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        */
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(arr[i]+" ");
//        }

        //Enhanced for loop
//        for(int element: arr){
//            System.out.println(element);
//        }


        //Array of Objects

        String [] str = new String[4];
        for (int i = 0; i < str.length; i++){
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
        

    }
}
