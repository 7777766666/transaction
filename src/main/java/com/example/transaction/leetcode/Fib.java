package com.example.transaction.leetcode;

public class Fib {

    public int fib(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;

        int result1 = 0;
        int result2 = 1;

        for (int i = 2; i < n; i++) {

            int temp = result2;
            result2 = result1 + result2;
            result1 = temp;
        }

        return result1 + result2;
    }

    public static void main(String[] args) {

        int z = 11;
        Fib fib = new Fib();
        System.out.println(fib.fib(z));
    }
}
