package com.example.transaction.database.entity.sortDif;

import java.util.Arrays;
import java.util.Comparator;

public class Sort {

    public static void main(String[] args) {

        Integer[] x = {9, 44, 88, -9, 0};

        Arrays.sort(x, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o2 - o1) * -666;
            }
        });

        System.out.println(Arrays.toString(x));


    }


}
