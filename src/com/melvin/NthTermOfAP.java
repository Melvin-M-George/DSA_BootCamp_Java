package com.melvin;

public class NthTermOfAP {
    public static void main(String[] args) {

    }

    int nthTermOfAP(int A1, int A2, int N) {
        // code here
        int d = A2-A1;
        return A1+(N-1)*d;
    }
}
