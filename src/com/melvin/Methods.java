package com.melvin;

import java.util.Scanner;

public class Methods {

    static void Greeting(){
        System.out.println("Hello, Good Morning!!");
    }

    static int Sum(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;


    }

    static String greet(){
        String greeting = "How are you?";
        return greeting;
    }

    static int sum1(int num1,int num2){
        return num1+num2;
    }

    public static void main(String[] args) {
        //int ans = Sum();
        //System.out.println(ans);

        //Greeting();

        //System.out.println(greet());
        System.out.println(sum1(10,20));
    }
}
