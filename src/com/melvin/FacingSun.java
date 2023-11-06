package com.melvin;
//Given an array H representing heights of buildings. You have to count the buildings which will see the sunrise (Assume : Sun rise on the side of array starting point).
//Note : Height of building should be strictly greater than height of buildings in left in order to see the sun.
public class FacingSun {
    public static void main(String[] args) {

    }

    int countBuildings(int h[], int n) {
        // code here
        int count = 0;
        int max = Integer.MIN_VALUE;
        for( int i=0; i<n;i++){

            if(max<h[i]){
                count = count + 1;
                max = h[i];
            }
        }
        return count;
    }
}
