package com.melvin;

public class Print_alternate {
    public static void main(String[] args) {

    }

    public static void print(int arr[], int n)
    {
        // your code here
        for(int i = 0; i < arr.length ; i++){
            if(i % 2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
