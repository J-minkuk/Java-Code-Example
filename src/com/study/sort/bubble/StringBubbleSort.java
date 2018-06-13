package com.study.sort.bubble;

import java.util.Arrays;

public class StringBubbleSort {

  static void swap(String[] a, int i, int j) {
    String temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

  static void bubbleSort(String[] a) {
    for (int i = a.length - 1; i >= 1; --i) {
      boolean flag = true;
      for (int j = 0; j < i; ++j) {
        if (a[j].compareTo(a[j+1]) > 0) {
          swap(a, j, j+1);
          flag = false;
        }
      }
      if (flag) break;
    }
  }

  public static void main(String[] args) {
    String[] a = { "z", "A", "a", "f", "y", "o" };

    bubbleSort(a);
    System.out.println(Arrays.toString(a));
  }

}
