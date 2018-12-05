package com.study.thread;

public class Sleep extends Thread {

  public static void main(String[] args) {
    Sleep sleep = new Sleep();
    sleep.start();

    try {
      int count = 0;
      while (count < 5) {
        sleep.join(1000);
        count++;
        System.out.format("%d second waited\n", count);
      }
      if (sleep.isAlive()) {
        sleep.interrupt();
      }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public void run() {
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      System.out.println("Somebody Stopped me.");
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      System.out.println("finally");
    }
  }
}
