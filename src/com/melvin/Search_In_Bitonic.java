package com.melvin;

public class Search_In_Bitonic {
    public static void main(String[] args) {

    }

    int search(int[] arr, int target){

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
    static int binarySearch(int[] arr, int target, int start, int end){

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
