package com.melvin;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking input from the user till user does not press x or x
        int ans =0;
        while (true){
            //Take operator as input
            System.out.print("Enter the operator: ");
            char op = sc.next().trim().charAt(0);
            if(op == '+' || op=='-' || op=='*' || op=='/' || op=='%'){
                //input two numbers
                System.out.print("Enter two numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                System.out.println();
                if(op=='+'){
                    ans = num1 + num2;
                }
                if(op=='-'){
                    ans = num1 - num2;
                }
                if(op=='*'){
                    ans = num1 * num2;
                }
                if(op=='/'){
                    if(num2 != 0){
                        ans = num1 / num2;
                    }
                }
                if(op=='%'){
                    ans = num1 % num2;
                }
            }
            else if(op=='X' || op=='x'){
                break;
            }
            else {
                System.out.println("Invalid Operation!!");
            }
            System.out.println(ans);
        }
    }
}
