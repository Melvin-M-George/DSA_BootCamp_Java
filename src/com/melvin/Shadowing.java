package com.melvin;

public class Shadowing {
    static int x = 90; // this will be shadowed at line 8-->higher level value is shadowed
    public static void main(String[] args) {
        System.out.println(x);// Prints 90
        int  x;
        //System.out.println(x); Variable x is not initialized yet
        x = 40;
        System.out.println(x); // Prints 40
        fun();// Print 90
    }
    static void fun(){
        System.out.println(x);
    }
}
