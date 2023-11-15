package com.melvin;

public class last_and_first_occurrence {
    public static void main(String[] args) {

    }
    public int[] indexes(long v[], long x)
    {
        // Your code goes here
        int first = -1;
        int second = -1;
        for(int i = 0; i < v.length;i++){
            if(v[i]==x && first == -1){
                first = i;
                second = i;
            }

            if(v[i]==x && first!=-1 && second < i){
                second = i;
            }

        }
        return new int[] {first,second};

    }
}
