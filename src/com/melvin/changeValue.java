package com.melvin;

import java.util.Arrays;

public class changeValue {
    static void change(int [] numbers){
        numbers[0] = 99;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
}
