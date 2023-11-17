package com.melvin;

public class BitonicArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2,1};
        int ans = peakIndexInMountainArray(arr);

    }

    static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            // find the middle element
            //int mid = (start + end) / 2; there is a possibility that start + end exceeds the range of int
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                //you are in the decreasing part of the array
                end = mid-1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
