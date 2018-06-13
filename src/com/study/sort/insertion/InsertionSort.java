package com.study.sort.insertion;

import java.util.Arrays;

public class InsertionSort {

  static void insertionSort(int[] a) {
    for (int i = 1; i < a.length; ++i) {
      int value = a[i];
      int j;

      for (j = i - 1; j >= 0; --j) {
        if (a[j] > value) {
          a[j+1] = a[j];
        }
        else break;
      }
      a[j+1] = value;
    }
  }

  public static void main(String[] args) {
    int[] a = { 10, 11, 6, 99, 50, 43, 7, 9, 4 };

    insertionSort(a);
    System.out.println(Arrays.toString(a));
  }

}
