package com.study.sort.merge;

import java.util.Arrays;

@SuppressWarnings("Duplicates")
public class MergeTest {

  static void merge(int[] a, int start, int middle, int end) {
    int length = end - start + 1;   // 병합할 부분의 길이를 구함
    int[] temp = new int[length];   // 병합 결과를 저장할 임시 배열 생성
    int i = 0;                      // 임시 배열의 인덱스
    int frontIndex = start;         // 앞부분(start ~ middle)의 인덱스
    int rearIndex = middle + 1;     // 뒷부분(middle+1 ~ end)의 인덱스

    /*
    병합할 값이 앞부분과 뒷부분에 둘 다 남아있다면
    앞부분과 뒷부분의 선두의 값을 비교하여
    더 작은 값이 임시 배열에 먼저 들어갑니다.
     */
    while (frontIndex <= middle && rearIndex <= end) {
      if (a[frontIndex] < a[rearIndex]) {
        temp[i++] = a[frontIndex++];
      }
      else {
        temp[i++] = a[rearIndex++];
      }
    }

    /*
    앞부분 배열에 남아있는 값을 임시 배열에 넣습니다.
     */
    while (frontIndex <= middle) {
      temp[i++] = a[frontIndex++];
    }

    /*
    뒷부분 배열에 남아있는 값을 임시 배열에 넣습니다.
     */
    while (rearIndex <= end) {
      temp[i++] = a[rearIndex++];
    }

    /*
    임시 배열의 내용을 a 배열의 해당 부분에 복사
     */
    for (i = 0; i < temp.length; ++i) {
      a[start + i] = temp[i];
    }

  }

  public static void main(String[] args) {
    int[] a1 = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
    merge(a1, 5, (5 + 9) / 2, 9);
    System.out.println(Arrays.toString(a1));

    int[] a2 = { 10, 11, 12, 13, 14, 17, 18, 19, 15, 16 };
    merge(a2, 5, (5 + 9) / 2, 9);
    System.out.println(Arrays.toString(a2));

    int[] a3 = { 10, 12, 14, 11, 13, 15, 16, 17, 18, 19 };
    merge(a3, 0, (0 + 4) / 2, 4);
    System.out.println(Arrays.toString(a3));
  }

}
