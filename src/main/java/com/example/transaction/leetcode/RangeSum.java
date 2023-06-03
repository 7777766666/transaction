package com.example.transaction.leetcode;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RangeSum {


    private List<String> summaryRanges(int[] nums) {

        List<String> list = new ArrayList<>();

        int i = 0;
        for (i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 != nums[i + 1]){
                list.add(String.valueOf(nums[i]));
            } else if (nums[i] +1 == nums[i + 1]) {
                int l = nums[i];
                int r = nums[i + 1];
                while ( i + 1 != nums.length-1 && nums[i] + 1 == nums[i + 1] ){
                    i++;
                }
                list.add(String.valueOf(nums[l]) + "->" + String.valueOf(nums[i]) );
            }

        }
        return list;
    }

    public static void main(String[] args) {

        int[] nums = {0, 2, 3, 4, 6, 8, 9};
        RangeSum rangeSum = new RangeSum();
        System.out.println(rangeSum.summaryRanges(nums));



    }
}
