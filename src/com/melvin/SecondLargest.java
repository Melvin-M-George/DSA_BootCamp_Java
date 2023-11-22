package com.melvin;

public class SecondLargest {
    public static void main(String[] args) {

    }

    int print2largest(int[] arr, int n) {
        int max=-1,smax=-1,i;
        for(i=0;i<n;i++){
            //We check if current element>max then change max and smax
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            //We check if current element<max and >smax then change smax only
            else if(arr[i]<max&&arr[i]>smax)
                smax=arr[i];
        }
        return smax;
    }
}
