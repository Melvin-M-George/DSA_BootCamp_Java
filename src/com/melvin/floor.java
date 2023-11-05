package com.melvin;

public class floor {
    public static void main(String[] args) {
        int [] arr ={2,3,5,9,14,16,18};
        int ans = floorOfNumber(arr,-2);
        System.out.println(ans);
    }

    static int floorOfNumber(int[] arr, int target){
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
        return end;
    }
}
