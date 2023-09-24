package com.melvin;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);


        //Type Casting
//        int num =(int) (65.95f);
//        System.out.println(num);

        //Automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte) a;  // 257 % 256 = 1
//        System.out.println(b);

//        int number = 'A';
//        System.out.println(number);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        //float + int - double = double
        System.out.println( (f * b) +" "+ (i / c) +" "+ (d * s));
        System.out.println(result);
    }
}
