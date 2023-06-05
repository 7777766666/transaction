package com.example.transaction.leetcode;

public class DeadlockExample1 {

    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();
        String x1 = new String("  ");
        String x2 = new String("  ");

        Thread thread1 = new Thread(() -> {
            synchronized (x1) {
                System.out.println("Thread 1 acquired lock1");
                try {
                    Thread.sleep(1111);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (x2) {
                    System.out.println("Thread 1 acquired lock2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (x2) {
                System.out.println("Thread 2 acquired lock2");
                synchronized (x1) {
                    System.out.println("Thread 2 acquired lock1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}

