package java8.stream.mistake;

import java.util.stream.IntStream;

/**
 * 연산자 순서 섞기
 */
public class OperationOrder01 {
  public static void main(String[] args) {
    /**
     * 원하지 않던 결과
     *
     * 56789
     */
    IntStream.iterate(0, i -> i + 1)
            .limit(10)  // LIMIT
            .skip(5)    // OFFSET
            .forEach(System.out::print);

    System.out.println();

    /**
     * 원하던 결과
     *
     * 567891011121314
     */
    IntStream.iterate(0, i -> i + 1)
            .skip(5)    // OFFSET
            .limit(10)  // LIMIT
            .forEach(System.out::print);
  }
}
