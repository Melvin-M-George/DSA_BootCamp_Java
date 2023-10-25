package com.melvin;

public class EvenDigits {
    public static void main(String[] args) {
        int [] nums = {12,345,22,6,7896};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }

    static int findNumbers(int[] nums){
        int count = 0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }

        return count;
    }


    //Function to check the number contains even digits or not
    private static boolean even(int num) {
        int numberOfDigits = digits(num);
        if(numberOfDigits % 2 == 0){
            return true;
        }
        return false;
    }


    //Count number of digits in a number
    static int digits(int num){
        int count = 0;
        while(num>0){
            count++;
            num = num / 10;
        }
        return count;
    }
}
