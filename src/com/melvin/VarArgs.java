package com.melvin;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5);
        multiple(2,4,"Melvin","Hello");
    }

    static void fun(int ...arg){
        System.out.println(Arrays.toString(arg));
    }

    static void multiple(int a,int b,String ...arg ){//Varargs must be in the last of the list

    }
}
