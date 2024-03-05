package com.cg.java8.features;

import sun.misc.ThreadGroupUtils;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        DBConnectionSingleton dbConnection = DBConnectionSingleton.getDBConnection();
        System.out.println(Thread.currentThread().getName() + " - Main Thread");
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                //for (int i = 0; i < 20; i++) {
                    //System.out.println(Thread.currentThread().getName() + " - i: " + i);
                    System.out.println(Thread.currentThread().getName() + " -- " + Thread.currentThread().getState());
                    return;

                //}
            }
        };
        Thread thread = new Thread(runnable);
//        System.out.println(Thread.currentThread().getName() + " - " + ThreadGroupUtils.getRootThreadGroup());
//        System.out.println(Thread.currentThread().getName() + " -- " + Thread.currentThread().getState());
        thread.start();
        Thread.sleep(5000);
        System.out.println(Thread.currentThread().getName() + " -- " + Thread.currentThread().getState());
    }
}
