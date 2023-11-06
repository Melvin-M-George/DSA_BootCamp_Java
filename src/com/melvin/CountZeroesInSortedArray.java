package com.melvin;

public class CountZeroesInSortedArray {
    public static void main(String[] args) {

    }

    int countZeroes(int[] arr, int n) {
        for(int i = 0; i < n; i++){
            if(arr[i]==0){
                return n-i;
            }
        }
        return 0 ;
    }
}
