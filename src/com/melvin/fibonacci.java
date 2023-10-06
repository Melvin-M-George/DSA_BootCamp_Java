package com.melvin;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int count = 3;

        if(n==1){
            System.out.println(0);
        }
        else if(n==2){
            System.out.println(1);
        }else {
            while(count <=n){
                int temp = b;
                b = a + b;
                a = temp;
                count++;
            }
            System.out.println("nth fibonacci number is "+ b);

        }





    }
}
