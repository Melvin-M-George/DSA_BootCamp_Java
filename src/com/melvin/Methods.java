package com.melvin;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        //Take input of two numbers and print sum
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = "+sum);
    }
}
