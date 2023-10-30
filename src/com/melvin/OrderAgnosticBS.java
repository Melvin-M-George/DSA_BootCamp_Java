package com.melvin;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-24,-18,-5,0,1,5,9,15,78,111};
        //int[] arr = {70,57,34, 16,11, 9,4,1};
        int target = 0;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

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
