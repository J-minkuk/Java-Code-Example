package com.study.threadpool.other;

public class People implements Runnable {
  private int index;
  private Object lock = new Object();

  public People(int index) {
    this.index = index;
  }

  @Override
  public void run() {
    synchronized (lock) {
      try {
        lock.wait(1000L);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.format("%d번째 MinGOOD 입장\n", index);

    }
  }
}
