package com.melvin;

public class PrintWithoutLoop {
    public static void main(String[] args) {

    }

    public void printNos(int N)
    {
        //Your code here
        if(N > 0){
            printNos(N-1);
            System.out.print(N + " ");
        }
    }
}
