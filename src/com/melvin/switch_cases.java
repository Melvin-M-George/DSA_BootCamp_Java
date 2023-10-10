package com.melvin;

import java.util.Scanner;

public class switch_cases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit){
            case "Apple":
                System.out.println(" A sweet red fruit");
                break;
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Orange":
                System.out.println("Round fruit in orange color");
                break;
            case "Grapes":
                System.out.println("Small fruit");
                break;
            default:
                System.out.println("Enter a valid fruit!!");
        }
    }
}
