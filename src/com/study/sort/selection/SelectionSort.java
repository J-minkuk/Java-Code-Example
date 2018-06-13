package com.study.sort.selection;

import java.util.Arrays;

public class SelectionSort {

  static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

  static int findMinIndex(int[] a, int start) {
    int minIndex = start;
    int minValue = a[start];

    for (int i = start + 1; i < a.length; ++i) {
      if (a[i] < minValue) {
        minValue = a[i];
        minIndex = i;
      }
    }
    return minIndex;
  }

  static void selectionSort(int[] a) {
    for (int i = 0; i < a.length; ++i) {
      int minIndex = findMinIndex(a, i);
      swap(a, i, minIndex);
    }
  }

  public static void main(String[] args) {
    int[] a = { 10, 11, 6, 99, 50, 43, 7, 9, 4 };

    selectionSort(a);
    System.out.println(Arrays.toString(a));
  }

}
