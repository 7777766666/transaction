package com.example.transaction.leetcode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Test {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 99, -999, -777));
        Test test = new Test();
        List<Object> objectsList = new ArrayList<>(Arrays.asList("StringMem", 666, "Lol"));
        test.mem(objectsList);



    }

    public void lol(List<? extends Number> list){
        System.out.println(list);
    }

    public void mem(List<? super Integer> list){
        System.out.println(list);
    }

}
