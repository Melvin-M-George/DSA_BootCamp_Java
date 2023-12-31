package com.melvin;

public class SearchInSortedArray {
    public static void main(String[] args) {

    }
    static int searchInSorted(int arr[], int N, int K) {

            // Your code here
            int start = 0;
            int end = arr.length - 1;

            while(start<= end){
                int mid = start + (end-start)/2;

                if(K < arr[mid]){
                    end = mid -1;
                }
                else if(K > arr[mid]){
                    start = mid + 1;
                }
                else{
                    return 1;
                }
            }
            return -1;
        }
}

