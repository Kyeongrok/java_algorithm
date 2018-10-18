package com.sort;

import java.util.Arrays;

public class BubbleSort {
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i += 1) {
            for (int j = i + 1; j < arr.length; j += 1) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 6, 2, 10};
        int[] result = new BubbleSort().sort(numbers);

        System.out.println(Arrays.toString(result));
    }
}
