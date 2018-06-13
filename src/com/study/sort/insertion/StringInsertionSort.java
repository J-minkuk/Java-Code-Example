package com.study.sort.insertion;

import java.util.Arrays;

public class StringInsertionSort {

  static void insertionSort(String[] a) {
    for (int i = 1; i < a.length; ++i) {
      String value = a[i];
      int j;
      for (j = i - 1; j >= 0; --j) {
        if (a[j].compareTo(value) > 0) {
          a[j+1] = a[j];
        }
        else break;
      }
      a[j+1] = value;
    }
  }

  public static void main(String[] args) {
    String[] a = { "z", "A", "a", "f", "y", "o" };

    insertionSort(a);
    System.out.println(Arrays.toString(a));
  }

}
