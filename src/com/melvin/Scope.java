package com.melvin;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
            int c = 45;
            System.out.println(c);
        }


    }

    static void random(int marks){
        int num = 69;
        System.out.println(num);
        System.out.println(marks);
    }
}
