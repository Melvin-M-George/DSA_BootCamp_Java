package com.melvin;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        //Syntax of Arraylist
        //ArrayList<Integer> list = new ArrayList<Integer>();
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

//
//
//        for (int i = 0; i < 5; i++) {
//            list.add(sc.nextInt());
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.print(list.get(i)+ " ");  // list[index] will not work here
//        }
//        System.out.println();
//
//        System.out.println(list);

        //MultiDimensional Array List
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialization
        for (int i = 0; i < 3 ; i++) {
            list.add(new ArrayList<>());
        }

        //Add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 ; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);







    }
}
