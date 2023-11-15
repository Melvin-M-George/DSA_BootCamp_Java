package com.melvin;

public class BS_Infinite_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2,3,4,5,7,8,13,15,18,19,29,46,58,59,62,69};
        int target = 46;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr, int target){
        //first find the range.
        //first start with a box of size 2
        int start = 0;
        int end = 1;
        // condition for the target to lie in the range
        while(target > arr[end]){
            int newStart = end + 1;
            //double the box size
            // end = previous end + (size of box * 2)
            end = end + (end - start + 1)*2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
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
