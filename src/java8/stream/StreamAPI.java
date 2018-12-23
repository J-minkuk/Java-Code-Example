package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StreamAPI {
  public static void main(String[] args) {
    System.out.println("Java7 : " + collectionJava7());
    System.out.println("Java8 : " + collectionJava8());
  }

  private static long collectionJava7() {
    List<Integer> integers = new ArrayList<>();
    long count = 0;

    for (int i = 0; i < 50; ++i) {
      integers.add(i);
    }

    for (int i = 0; i < 50; ++i) {
      integers.set(i, integers.get(i) * 2);
    }

    for (int i = 0; i < 50; ++i) {
      if (integers.get(i) % 3 == 0) {
        count++;
      }
    }

    return count;
  }

  private static long collectionJava8() {
    return IntStream.range(0, 50)
            .mapToObj(value -> value * 2)
            .filter(value -> value % 3 == 0)
            .count();
  }
}
