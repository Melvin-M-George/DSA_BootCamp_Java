package com.melvin;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        //Syntax of Arraylist
        ArrayList<Integer> list = new ArrayList<Integer>();
        /*
        list.add(34);
        list.add(4);
        list.add(67);
        list.add(89);
        //System.out.println(list.contains(4));
        System.out.println(list);
        list.set(0,99);
        list.remove(2);
        System.out.println(list);
        */

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

        System.out.println(list);



    }
}
