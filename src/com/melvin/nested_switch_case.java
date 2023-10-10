package com.melvin;

import java.util.Scanner;

public class nested_switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String department = sc.next();


        switch (empID) {
            case 1:
                System.out.println("Melvin");
                break;
            case 2:
                System.out.println("Shinto");
                break;
            case 3:
                switch (department) {
                    case "BCE" -> System.out.println("Core");
                    case "BAI" -> System.out.println("AI-ML");
                    default -> System.out.println("Enter another department");
                }
                break;
            default:
                System.out.println("Enter correct empID");
        }
    }
}
