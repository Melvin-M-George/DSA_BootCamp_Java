package com.melvin;

public class Method_Overloading {
    public static void main(String[] args) {
        fun();
        fun(78);
        fun("Melvin");
    }

    static void fun(){
        System.out.println("Hello");
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }

}
