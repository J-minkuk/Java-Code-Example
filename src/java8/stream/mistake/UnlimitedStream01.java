package java8.stream.mistake;

import java.util.stream.IntStream;

/**
 * "무한" 스트림 생성 문제
 */
public class UnlimitedStream01 {
  public static void main(String[] args) {
    // 무한
//    IntStream.iterate(0, i -> i + 1)
//            .forEach(System.out::println);

    // 0 ~ 9
    IntStream.iterate(0, i -> i + 1)
            .limit(10)
            .forEach(System.out::println);
  }
}
