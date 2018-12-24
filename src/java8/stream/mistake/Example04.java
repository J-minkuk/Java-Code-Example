package java8.stream.mistake;

import java.util.stream.IntStream;

/**
 * 의도치 않게 생성된 병렬 무한 스트림
 */
public class Example04 {
  public static void main(String[] args) {
    /**
     * Example03 에서는 cpu 를 하나만 혹사시킨 반면, 여기서는 더 많이 사용할 것이다.
     * 잠재적으로 시스템의 모든 리소스를 점거할 것이다.
     */
    IntStream.iterate(0, i -> (i + 1) % 2)
            .parallel()
            .distinct()
            .limit(10)
            .forEach(System.out::println);

    System.out.println("complete");
  }
}
