package com.study.map;

import java.util.HashMap;
import java.util.Map;

public class Example02 {

  public static void main(String[] args) {
    Map<Integer, Person> map = new HashMap<>();

    map.put(101, new Person("홍길동", 18));
    map.put(102, new Person("임꺽정", 19));

    System.out.printf("%s  %s  %s\n", map.get(101), map.get(102), map.get(103));

    map.remove(102);
    System.out.printf("%s  %s  %s\n", map.get(101), map.get(102), map.get(103));

  }

}