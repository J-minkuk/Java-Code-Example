package com.study.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class HasNextEx01 {

  public static void main(String[] args) {

    Collection<Integer> c = new ArrayList<Integer>();

    for (int i = 0; i < 10; ++i)
      c.add(i);

    for (Integer i : c)
      System.out.print(i + " ");

    System.out.println();

    Iterator<Integer> iterator = c.iterator();
    while (iterator.hasNext()) {
      Integer i = iterator.next();
      System.out.print(i + " ");
    }
  }

}