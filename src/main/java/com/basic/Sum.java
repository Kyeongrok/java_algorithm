package com.basic;

import java.util.ArrayList;

public class Sum {
    public int getSum(int accu, ArrayList<Integer> arr) {
        if (arr.size() < 1) return accu;
        accu += arr.remove(arr.size() - 1);
        return getSum(accu, arr);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arl = new ArrayList<>();
        arl.add(10);
        arl.add(20);
        arl.add(30);

        int result = new Sum().getSum(0, arl);
        System.out.println(result);
    }
}
