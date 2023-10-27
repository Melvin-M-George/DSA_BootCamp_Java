package com.melvin;

public class findMinNumber {
    public static void main(String[] args) {
        int [] arr = { 18, 12, -7, -3333, 14, -28};
        int ans = min(arr);
        System.out.println(ans);
    }
    static int min(int [] arr){
        int minimum = Integer.MAX_VALUE;
        for(int element : arr){
            if(element < minimum){
                minimum = element;
            }
        }
        return minimum;
    }
}
