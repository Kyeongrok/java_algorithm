package com.basic;

public class Factorial {
    public int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int result = new Factorial().factorial(4);
        System.out.println(result);

        // factorial일 때 jvm에서 일어나는 일

    }
}