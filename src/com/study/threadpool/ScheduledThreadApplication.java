package com.study.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class ScheduledThreadApplication {

  public static void main(String[] args) {
    ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);

    IntStream.range(0, 15)
            .forEach(action -> scheduledExecutorService.schedule(() -> {
              System.out.println(scheduledExecutorService.toString() + " # " + action);
            }, 1000L, TimeUnit.MILLISECONDS));
  }

}
