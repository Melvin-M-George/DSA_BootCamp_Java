package com.melvin;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Melvin";

        {
            //int a = 10; already initialized outside the block, so cannot initialize again, but can change value
            a = 100;
            System.out.println(a);
            int c = 45;// values initialized in the block will remain in the block
            System.out.println(c);

            name = "Manav";
            System.out.println(name);
            //anything that is initialized inside the block, can be initialised again outside the block
        }
        int c = 78;//initialised inside the block and outside the block

        //System.out.println(c); cannot use outside the block
        System.out.println(a);// Shows changed value
        System.out.println(name);//Shows changed value


        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            int num = 99;
        }
        //System.out.println(i); i can only be accessed inside the for loop
        //System.out.println(num);  can only be accessed inside the for loop


    }

    static void random(int marks){
        int num = 69;
        System.out.println(num);
        System.out.println(marks);
    }
}
