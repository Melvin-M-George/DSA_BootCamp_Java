package com.melvin;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr ={-122, -34, -4, 0, 11, 22, 34, 48, 57, 89, 133, 189};
        int ans = binarySearch(arr,133);
        System.out.println(ans);
    }

    // return the index
    // return -1 if the target element does not exist

    static int binarySearch(int[] arr, int target){
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
        return -1;
    }
}
