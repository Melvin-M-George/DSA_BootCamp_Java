package com.melvin;

public class Index_of_extra_element {
    public static void main(String[] args) {

    }

    public int findExtra(int a[], int b[], int n) {
        // add code here.
        int sumA = 0;
        for(int i = 0;i<a.length;i++){
            sumA = sumA + a[i];
        }
        int sumB = 0;
        for(int j = 0;j<b.length;j++){
            sumB = sumB + b[j];
        }
        int ans=0;
        int diff = sumA- sumB;

        for(int i=0; i<a.length;i++){
            if(a[i]==diff){
                ans = i;
            }
        }

        return ans;
    }
}
