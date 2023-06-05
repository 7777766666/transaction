package com.example.transaction.leetcode;

import java.util.Arrays;

public class Sur {


    public static void main(String[] args) {

        String x = "𐀀𐀀𐀀𐀀";
        for (int i = 0; i < x.length(); i++) {
            System.out.print(x.charAt(i) + " ");
        }



    }

    private static boolean lol(String lol){

        int z = lol.length() - 1;
        for (int i = 0; i < lol.length(); i++) {
            if (lol.charAt(i) != lol.charAt(z)){
                return false;
            }
            z--;
        }
        return true;
    }
}
