package com.study.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example1 {
  public static void main(String[] args) {
    Set<Integer> set1 = new TreeSet<>();
    Set<Integer> set2 = new HashSet<>();
    Set<Integer> set3 = new LinkedHashSet<>();

    set1.add(3); set1.add(5); set1.add(7); set1.add(1); set1.add(3); set1.add(5);
    set2.add(3); set2.add(5); set2.add(7); set2.add(1); set2.add(3); set2.add(5);
    set3.add(3); set3.add(5); set3.add(7); set3.add(1); set3.add(3); set3.add(5);

    System.out.println(set1);
    System.out.println(set2);
    System.out.println(set3);
  }
}
