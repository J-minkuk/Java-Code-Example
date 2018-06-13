package com.study.sort.quick;

import java.util.Arrays;
import java.util.Random;

@SuppressWarnings("Duplicates")
public class QuickSort {

  static void swap(int[] a, int i, int j) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

  static int partition(int[] a, int start, int end) {
    int value = a[end];
    int i = start - 1;

    for (int j = start; j < end; ++j) {
      if (a[j] < value) {
        swap(a, ++i, j);
        System.out.println(Arrays.toString(a));
      }
    }
    swap(a, i + 1, end);
    System.out.println(Arrays.toString(a));
    return i + 1;
  }

  static void quickSort(int[] a, int start, int end) {
    System.out.format("quickSort(a, %d, %d)\n", start, end);
    if (start >= end) return;
    int middle = partition(a, start, end);
    System.out.format("middle = %d\n", middle);
    quickSort(a, start, middle - 1);
    quickSort(a, middle + 1, end);
  }

  public static void main(String[] args) {
    Random random = new Random();
    int[] a = new int[10];
    for (int i = 0; i < a.length; ++i) {
      a[i] = random.nextInt(20);
    }

    // int[] a = { 10, 13, 18, 7, 11, 6, 16, 15, 5, 10 };

    System.out.println(Arrays.toString(a));
    quickSort(a, 0, a.length - 1);
    System.out.println(Arrays.toString(a));
  }

}
