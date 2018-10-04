package com.bingap;

public class BinMaker {
    String getBin(String result, int num) {
        if (num >= 1) {
            return getBin(result + num % 2, num / 2);
        }
        return result;
    }

    public static void main(String[] args) {
        String result = new BinMaker().getBin("", 1041);
        System.out.println(result);
    }
}
