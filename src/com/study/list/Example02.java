package com.study.list;

import java.util.ArrayList;
import java.util.List;

public class Example02 {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");

    list.remove("c");
    list.set(2, "D");

    for (String s : list) System.out.printf("%s ", s);

  }

}
