package com.melvin;

public class linear_search {
    public static void main(String[] args) {
    int [] num = {1,2,3,4,5,6};
    int ans = linearSearch(num,55);
    System.out.println(ans);
    }

    // search in the array : return index if the item found
    // otherwise if the item not found return -1

    static int linearSearch(int [] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length ; index++) {
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
}

