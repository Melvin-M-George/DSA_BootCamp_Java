package com.melvin;

public class Smaller_and_larger {
    public static void main(String[] args) {

    }

    int[] getMoreAndLess(int[] arr, int n, int x) {
        // code here
        int count_less = 0;
        int count_more = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= x){
                count_less = count_less + 1;
            }
            if( arr[i] >= x){
                count_more = count_more +1;
            }
        }
        int [] result = {count_less,count_more};
        return result;
    }
}
