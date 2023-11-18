package com.melvin;

public class Search_In_Bitonic {
    public static void main(String[] args){

    }

    int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        //try to search in second half

    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
            //int mid = (start + end) / 2; there is a possibility that start + end exceeds the range of int
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //you are in the decreasing part of the array
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    static int orderAgnosticBS(int[] arr, int target, int start, int end){

        // find if the array is sorted in ascending or descending

        boolean isAsc = arr[start] < arr[end];

        while (start<=end){
            // find the middle element
            int mid = start + (end -start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                if (target > arr[mid]){
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
