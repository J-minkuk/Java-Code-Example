package java8.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SumStream {
  public static void main(String[] args) {
    List<Integer> integers = new ArrayList<>();
    integers.add(10); integers.add(2); integers.add(11);

    System.out.println(sumIterator(integers));
    System.out.println(sumStream(integers));
  }

  private static int sumIterator(List<Integer> integers) {
    Iterator<Integer> iterator = integers.iterator();
    int sum = 0;

    while (iterator.hasNext()) {
      int num = iterator.next();
      if (num > 10) {
        sum += num;
      }
    }
    return sum;
  }

  private static int sumStream(List<Integer> intergers) {
    return intergers.stream()
            .filter(value -> value > 10)
            .mapToInt(value -> value)
            .sum();
  }
}
