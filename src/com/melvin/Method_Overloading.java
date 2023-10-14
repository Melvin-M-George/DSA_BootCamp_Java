package com.melvin;

import java.util.Arrays;

public class Method_Overloading {
    public static void main(String[] args) {
        fun(78);
        fun("Melvin");
        //fun(); Error-->Ambiguity
    }
    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }

    static void fun(int ...arg){
        System.out.println(Arrays.toString(arg));
    }
    static void fun(String ...arg){
        System.out.println(Arrays.toString(arg));
    }

}
