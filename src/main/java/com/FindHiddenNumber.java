package com;

import java.util.stream.IntStream;

/*
    1 + 0 + (-1) = 0 이 되는 x가 있는지 찾기
 */
public class FindHiddenNumber {
    private int getHiddenNumber(int[] arr) {
        int sum = IntStream.of(arr).sum();

        int x = sum / arr.length;

        System.out.println("sum:" + sum + " quota:" + x);

        if (x * arr.length == sum) {
            return x;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
//        arr = new int[]{68, 77, 54};

        System.out.println("result:"+new FindHiddenNumber().getHiddenNumber(arr));

    }
}
