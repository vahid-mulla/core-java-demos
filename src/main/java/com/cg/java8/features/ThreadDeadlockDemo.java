package com.cg.java8.features;

public class ThreadDeadlockDemo {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread threadA = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("first lock is called");
                System.out.println("lock1" + Thread.currentThread().getName());
//                synchronized (lock2) {
//                    System.out.println("second lock is called");
//                }
            }
        });

        Thread threadB = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("second lock is called");
                System.out.println("lock2" + Thread.currentThread().getName());
                synchronized (lock1) {
                    System.out.println("first lock is called");
                }
            }
        });

        threadA.start();
        threadB.start();
        Thread.yield();
    }
}
