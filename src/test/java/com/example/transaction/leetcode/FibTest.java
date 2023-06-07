package com.example.transaction.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibTest {

    @Test
    void fib() {

        int x = 10; //55
        int t = 11; //89

        Fib fib = new Fib();
        int actual1 = fib.fib(10);
        int actual2 = fib.fib(11);


        assertAll(
                () -> assertEquals(55, actual1),
                () -> assertEquals(89, actual2)


        );



    }
}