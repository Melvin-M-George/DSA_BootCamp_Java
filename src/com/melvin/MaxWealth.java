package com.melvin;

public class MaxWealth {
    public static void main(String[] args) {
        int [][] accounts = {{1,2,3},
                             {3,2,1}};
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts ){
        // row = person and col = account
        int max = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            //whenever you start a new col, take a new sum for that row
            int rowSum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                rowSum = rowSum + accounts[person][account];
            }
            if(rowSum > max){
                max = rowSum;
            }
        }
        return max;
    }
}
