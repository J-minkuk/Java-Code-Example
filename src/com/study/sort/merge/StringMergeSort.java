package com.study.sort.merge;

import java.util.Arrays;

@SuppressWarnings("Duplicates")
public class StringMergeSort {

  static void mergeSort(String[] a, int start, int end) {
    if (start == end) return;             // 정렬한 부분의 길이가 1이면 리턴
    int middle = (start + end) / 2;       // start와 end 사이 중간 지점을 계산
    mergeSort(a, start, middle);          // 앞부분 정렬 재귀 호출
    mergeSort(a, middle + 1, end);  // 뒷부분 정렬 재귀 호출
    merge(a, start, middle, end);         // 앞부분과 뒷부분 병합

  }

  static void merge(String[] a, int start, int middle, int end) {
    int length = end - start + 1;
    String[] temp = new String[length];
    int i = 0;
    int frontIndex = start;
    int rearIndex = middle + 1;

    while (frontIndex <= middle && rearIndex <= end) {
      if (a[frontIndex].compareTo(a[rearIndex]) < 0) {
        temp[i++] = a[frontIndex++];
      }
      else {
        temp[i++] = a[rearIndex++];
      }
    }

    while (frontIndex <= middle) {
      temp[i++] = a[frontIndex++];
    }

    while (rearIndex <= end) {
      temp[i++] = a[rearIndex++];
    }

    for (i = 0; i < temp.length; ++i) {
      a[start + i] = temp[i];
    }
  }

  public static void main(String[] args) {
    String[] a = { "z", "A", "a", "f", "y", "o" };

    mergeSort(a, 0, a.length - 1);
    System.out.println(Arrays.toString(a));
  }

}
