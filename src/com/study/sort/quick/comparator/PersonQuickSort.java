package com.study.sort.quick.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class PersonQuickSort {

  static void swap(Object[] a, int i, int j) {
    Object temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

  static int partition(Person[] a, int start, int end, Comparator comparator) {
    Person value = a[end];
    int i = start - 1;

    for (int j = start; j < end; ++j) {
      if (comparator.compare(a[j], value) < 0) {
        swap(a, ++i, j);
      }
    }
    swap(a, i + 1, end);
    return i + 1;
  }

  static void quickSort(Person[] a, int start, int end, Comparator comparator) {
    if (start >= end) return;
    int middle = partition(a, start, end, comparator);
    quickSort(a, start, middle - 1, comparator);
    quickSort(a, middle + 1, end, comparator);
  }

  public static void main(String[] args) {
    Person[] a = new Person[] {
            new Person("조민국", 27), new Person("박영환", 28),
            new Person("마재희", 25), new Person("박결", 27),
            new Person("노욱진", 26), new Person("배다슬", 26),
            new Person("주동석", 21), new Person("홍다은", 20),
            new Person("조민국", 21)
    };

    quickSort(a, 0, a.length - 1, new PersonNameComparator());
    System.out.println(Arrays.toString(a));

    quickSort(a, 0, a.length - 1, new PersonAgeComparator());
    System.out.println(Arrays.toString(a));
  }

}
