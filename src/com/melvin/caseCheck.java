package com.melvin;

import java.util.Scanner;

public class caseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        System.out.println(ch);

        if(ch>'a' && ch<'z'){
            System.out.println("LowerCase");
        }
        if(ch>'A' && ch<'Z'){
            System.out.println("UpperCase");
        }





    }

}
