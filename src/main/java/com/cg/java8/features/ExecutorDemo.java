package com.cg.java8.features;

import java.util.concurrent.*;

public class ExecutorDemo {

    private static class MyRunnable implements Runnable {
        @Override
        public void run() {
            // Perform your tasks here
            System.out.println("Hello, Runnable!");
        }
    }

    private static class MyCallable implements Callable {
        @Override
        public Object call() throws Exception {
            return "Hello, Callable!";
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Executor executor = new ThreadPoolExecutor(1, 10,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());
        executor.execute(new MyRunnable());

        Callable myCallable = new MyCallable();
        FutureTask<String> myFutureTask = new FutureTask<>(myCallable);
        myFutureTask.run();
        System.out.println(myFutureTask.get());
    }

}
