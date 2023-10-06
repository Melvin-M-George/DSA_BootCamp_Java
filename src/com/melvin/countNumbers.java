package com.melvin;

public class countNumbers {

    public static void main(String[] args) {

        //Ex: n = 12357723737272- find how many times 7 is repeated in the number

         int n = 37393779; // find number of 3s
         int count = 0;

         while(n>0){
             int reminder = n % 10; //last digit
             if(reminder==3){
                 count++;

             }
             n = n/10;

         }
        System.out.println(count);

    }
}
