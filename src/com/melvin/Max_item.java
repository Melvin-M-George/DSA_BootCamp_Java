package com.melvin;

public class Max_item {
    public static void main(String[] args) {
        int [] arr = {1, 3, 23, 9, 18,6 };
        System.out.println(max(arr));
    }

    static int max(int [] arr){
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(maxValue < arr[i]){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
