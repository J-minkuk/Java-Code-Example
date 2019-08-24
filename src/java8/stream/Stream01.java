package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream01 {
    public static void main(String[] args) {
        String[] exArr = {"GROOT", "FLO", "DreamUs", "SK"};
        List<String> exList = Arrays.asList(exArr);

        Stream<String> listStream = exList.stream();
        Stream<String> arrStream = Arrays.stream(exArr);

        listStream.sorted().forEach(System.out::println);
        arrStream.sorted().forEach(System.out::println);

//        listStream.count(); // Stream은 일회성이기 때문에 Exception 발생
        int exCount = (int) exList.stream().count();
        System.out.println(exCount);
    }
}
