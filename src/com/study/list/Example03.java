package com.study.list;

import java.util.ArrayList;
import java.util.List;

public class Example03 {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    list.add("e");

    List<String> list2 = list.subList(1, 4);

    for (String s : list2) System.out.printf("%s ", s);
    System.out.println();

    list.set(1, list.get(0));
    list.set(3, list.get(2));

    for (String s : list) System.out.printf("%s ", s);

  }

}
