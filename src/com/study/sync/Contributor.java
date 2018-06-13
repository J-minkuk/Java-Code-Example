package com.study.sync;

public class Contributor extends Thread {
  private Contribution myContribution;
  private String myName;

  public Contributor(Contribution contribution, String name) {
    myContribution = contribution;
    myName = name;
  }

  public void run() {
    for (int i = 0; i < 1000; ++i) {
      myContribution.donate();
    }
    System.out.format("%s total = %d\n", myName, myContribution.getTotal());
  }
}
