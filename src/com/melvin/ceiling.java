package com.melvin;

public class ceiling {
    public static void main(String[] args) {
        int [] arr ={2,3,5,9,14,16,18};
        int ans = ceilingOfNumber(arr,15);
        System.out.println(ans);
    }

    static int ceilingOfNumber(int[] arr, int target){
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            // find the middle element
            //int mid = (start + end) / 2; there is a possibility that start + end exceeds the range of int
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
