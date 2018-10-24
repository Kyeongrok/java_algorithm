package com.search;

public class BinarySearchRecursive {
    public int binarySearch(int[] arr, int startIndex, int endIndex, int num) {

        if(endIndex >= 1){
            int pivot = startIndex + (endIndex - 1) / 2;
            if (arr[pivot] == num) {
                return pivot;
            } else if (arr[pivot] > num) {

            } else {

            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 19};

        int result = new BinarySearchRecursive().binarySearch(arr, 0, arr.length - 1, 8);
        System.out.println(result);

    }
}
