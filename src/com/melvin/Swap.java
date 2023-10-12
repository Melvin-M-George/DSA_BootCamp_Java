package com.melvin;

public class Swap {

    static void swap(int a , int b){
        int temp;
        temp = a;
        a = b;
        b = temp;

    }
    public static void main(String[] args) {

        //Swap numbers
//        int temp = a;
//        a = b;
//        b = temp;

        //System.out.println(a + " "+ b);

        int a = 10;
        int b = 20;
        swap(a,b);
        System.out.println(a +" "+b);
    }
}
