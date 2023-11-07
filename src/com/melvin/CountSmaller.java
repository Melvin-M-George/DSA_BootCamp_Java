package com.melvin;

public class CountSmaller {
    public static void main(String[] args) {

    }

    public long countOfElements(long arr[], long n, long x)
    {
        int count = 0;
        for(long element : arr){
            if(element <= x){
                count = count + 1;
            }
        }
        return count;

    }
}
