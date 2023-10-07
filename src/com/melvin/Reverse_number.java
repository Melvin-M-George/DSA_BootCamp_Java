package com.melvin;

public class Reverse_number {
    public static void main(String[] args) {

        int n = 1234567;
        int ans = 0;
        while(n>0){
            int reminder = n % 10;
            ans = (ans * 10) + reminder;
            n = n/10;
        }

        System.out.println(ans);

    }
}
