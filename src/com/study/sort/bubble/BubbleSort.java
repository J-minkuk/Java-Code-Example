package com.study.sort.bubble;

import java.util.Arrays;

public class BubbleSort {

  static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

  static void bubbleSort(int[] a) {
    for (int i = a.length - 1; i >= 1; --i) {
      boolean flag = true;
      for (int j = 0; j < i; ++j) {
        if (a[j] > a[j+1]) {
          swap(a, j, j+1);
          flag = false;
        }
      }
      if (flag) break;
    }
  }

  public static void main(String[] args) {
    int[] a = { 10, 11, 6, 99, 50, 43, 7, 9, 4 };

    bubbleSort(a);
    System.out.println(Arrays.toString(a));
  }

}
