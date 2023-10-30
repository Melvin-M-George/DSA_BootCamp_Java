package com.melvin;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {70,57,34, 16,11, 9,4,1};
        int target = 4;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        // find if the array is sorted in ascending or descending

        boolean isAsc = arr[start] < arr[end];

        while (isAsc){
            // find the middle element
            int mid = start + (end -start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(target > mid){
                start = mid + 1;
            } else if (target < mid) {
                end = mid -1;
            }
            else {
                return mid;
            }
        }

        while (!isAsc){
            int mid = end + (start-end) / 2;
            if (target > mid){
                end = mid -1;
            } else if (target < mid) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
