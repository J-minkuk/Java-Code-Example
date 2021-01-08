package com.study.forkjoinpool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

/**
 * 설명 :
 *
 * @author Hardy(조민국) / dev.mingood@dreamus.io
 * @since 2021. 01. 08
 */
class FutureApp {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ForkJoinPool forkJoinPool = new ForkJoinPool(4);
        MyRecursiveTask myRecursiveTask = new MyRecursiveTask(128);
        Future<Long> future = forkJoinPool.submit(myRecursiveTask);

        System.out.println("@@@@@");
        System.out.println("mergedResult = " + future.get());
    }
}
