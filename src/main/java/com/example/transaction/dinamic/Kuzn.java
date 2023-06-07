package com.example.transaction.dinamic;

public class Kuzn {

    public static void main(String[] args) {

        int[] x = new int[]{-4, -4, -5, -2, 1, 3, 1, 2, -4, -3};
        int[] x1 = new int[]{5, -6, -7, -8, -9, 3, -4, -5, -10, 12};
        Kuzn kuzn = new Kuzn();

        System.out.println(kuzn.maxWay(x1));
        System.out.println(kuzn.another(x1));


    }

    public int maxWay(int[] nums) {

        int x1 = 0;
        int x2 = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            var temp = x2;
            x2 = Math.max(x1, x2) + nums[i];
            x1 = temp;

        }


        return x2;
    }

    private int another(int[] x){
        int[] lol = new int[2];
        lol[0] = 0;
        lol[1] = x[0];

        for (int i = 1; i < x.length; i++) {
            var temp = lol[1];
            lol[1] = Math.max(lol[1], lol[0] ) + x[i];
            lol[0] = temp;
        }

        return lol[1];
    }


}
