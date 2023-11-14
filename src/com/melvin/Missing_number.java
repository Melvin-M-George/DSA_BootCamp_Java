package com.melvin;

public class Missing_number {
    public static void main(String[] args) {

    }

    int missingNumber(int array[], int n) {
        // Your Code Here

        int totalsum = n * (n+1)/2;
        int sum = 0;
        for(int i = 0;i<n-1;i++){
            sum = sum + array[i];
        }
        return (totalsum - sum);
    }
}
