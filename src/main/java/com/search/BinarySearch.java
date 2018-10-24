package com.search;

public class BinarySearch {
    public int search(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;

        while (true) {
            int pivot = (start + end) / 2;
            if (arr[pivot] == num) {
                return pivot;
            } else if (arr[pivot] > num) {
                end = pivot;
            } else {
                start = pivot;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 19};
        int result = new BinarySearch().search(arr, 8);
        System.out.println(result);

    }
}
