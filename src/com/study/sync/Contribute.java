package com.study.sync;

public class Contribute {

  public static void main(String[] args) {
    Contributor[] contributors = new Contributor[10];
    Contribution group = new Contribution();

    for (int i = 0; i < 10; ++i) {
      contributors[i] = new Contributor(group, " Contributor" + i);
    }

    for (int i = 0; i < 10; ++i) {
      contributors[i].start();
    }
  }

}
