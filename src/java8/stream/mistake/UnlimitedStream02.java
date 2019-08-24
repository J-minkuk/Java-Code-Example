package java8.stream.mistake;

import java.util.stream.IntStream;

/**
 * 의도치 않게 생성된 무한 스트림
 */
public class UnlimitedStream02 {
  public static void main(String[] args) {
    /**
     * - 0과 1을 반복적으로 생성
     * - 개별 값 하나를 유지, 즉, 단일 0과 1
     * - 10개의 크기로 스트림에 제한
     * - 그것을 10개까지 출력
     *
     * 하지만 distinct() 연산자는 iterate() 함수가 오직 0과 1이라는 값만 생성할 것을 알지 못한다.
     * 결국 스트림으로부터 무한히 값을 받아들여 사용할 것이다.
     * limit(10) 에는 도달하지 못한다. 즉, complete 가 절대로 찍히지 않는다.
     */
    IntStream.iterate(0, i -> (i + 1) % 2)
            .distinct()
            .limit(10)
            .forEach(System.out::println);

    // 해결
//    IntStream.iterate(0, i -> (i + 1) % 2)
//            .limit(10)
//            .distinct()
//            .forEach(System.out::println);

    System.out.println("complete");
  }
}
