package com.melvin;

public class Count_odd_even {
    public static void main(String[] args) {

    }
    public void countOddEven(int[] arr, int n)
    {

        int countodd = 0;
        int counteven = 0;
        for(int i = 0; i < n ; i++){
            if(arr[i] % 2 == 0){
                counteven++;
            }
            else{
                countodd++;
            }
        }
        System.out.println(countodd+" "+counteven);
    }
}
