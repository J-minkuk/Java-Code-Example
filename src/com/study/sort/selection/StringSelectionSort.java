package com.study.sort.selection;

import java.util.Arrays;

public class StringSelectionSort {

  static void swap(String[] a, int i, int j) {
    String temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

  static int findMinIndex(String[] a, int start) {
    int minIndex = start;
    String minValue = a[start];

    for (int i = start + 1; i < a.length; ++i) {
      if (a[i].compareTo(minValue) < 0) {
        minValue = a[i];
        minIndex = i;
      }
    }
    return minIndex;
  }

  static void selectionSort(String[] a) {
    for (int i = 0; i < a.length; ++i) {
      int minIndex = findMinIndex(a, i);
      swap(a, i, minIndex);
    }
  }

  public static void main(String[] args) {
    String[] a = { "z", "A", "a", "f", "y", "o" };

    selectionSort(a);
    System.out.println(Arrays.toString(a));
  }

}
