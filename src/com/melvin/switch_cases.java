package com.melvin;

import java.util.Scanner;

public class switch_cases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String fruit = sc.next();
//
//        switch (fruit) {
//            case "Apple" -> System.out.println(" A sweet red fruit");
//            case "Mango" -> System.out.println("King of fruits");
//            case "Orange" -> System.out.println("Round fruit in orange color");
//            case "Grapes" -> System.out.println("Small fruit");
//            default -> System.out.println("Enter a valid fruit!!");
//        }
        int day = sc.nextInt();

        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter a valid day");
        }

    }
}
