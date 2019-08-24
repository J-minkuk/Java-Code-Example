package java8.stream.mistake;

import java.util.stream.IntStream;

/**
 * 재사용 스트림 문제
 */
public class ReUseStream01 {
  public static void main(String[] args) {
    IntStream stream = IntStream.of(1, 2);
    stream.forEach(x -> System.out.println(x));

    stream.forEach(x -> System.out.println(x));
  }
}
