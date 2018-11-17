package com.study.threadpool.other;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class WalkParallel {

  public static void main(String[] args) {
    WalkParallel wp = new WalkParallel();
    System.out.println("ThreadPoolExecutor 예제");
    wp.action(10);
  }

  private void action(int size) {
    System.out.format("%d명의 MinGOOD 분신술\n", size);

    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 20, 60, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
    for (int i = 0; i < size; ++i) {
      threadPoolExecutor.execute(new People(i + 1));
    }
    threadPoolExecutor.shutdown();
  }

}
