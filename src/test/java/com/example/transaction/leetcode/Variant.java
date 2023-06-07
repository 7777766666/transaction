package com.example.transaction.leetcode;

public class Variant {

    public int climbStairs(int n) {

        if (n == 1 || n == 2) {
            return (n == 1) ? 1 : 2;
        }


        int x1 = 1;
        int x2 = 2;

        for (int i = 3; i <= n; i++) {
           var temp = x2;
           x2 += x1;
           x1 = temp;
        }
        return x2;

    }

    public static void main(String[] args) {

        int x = 6;
        Variant variant = new Variant();
        System.out.println(variant.climbStairs(x));

    }


}
