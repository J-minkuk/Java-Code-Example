package com.study.forkjoinpool;

import java.util.concurrent.ForkJoinPool;

/**
 * 설명 :
 *
 * @author Hardy(조민국) / dev.mingood@dreamus.io
 * @since 2021. 01. 08
 */
class ActionApp {
    static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool(4);
        MyRecursiveAction myRecursiveAction = new MyRecursiveAction(128);
        forkJoinPool.invoke(myRecursiveAction);
    }
}
