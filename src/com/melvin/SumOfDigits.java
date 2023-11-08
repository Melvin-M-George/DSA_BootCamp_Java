package com.melvin;

public class SumOfDigits {
    public static void main(String[] args) {

    }

    static int sumOfDigits(int N) {
        // code here
        int sum = 0;
        while(N>0){

            int x = N % 10;
            sum = sum + x;
            N = N/10;

        }
        return sum;
    }
}
