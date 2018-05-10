package com.study.regex;

public class Example01 {

  public static void main(String[] args) {

    String[] a = new String[] { "010-323-1232",
                                "02-542-3322",
                                "010-9930-1123",
                                "032-431-2323" };

    String regex = "0(2|[1-9]{2})-[0-9]{3}-[0-9]{4}";

    for(String s : a) {
      if(s.matches(regex))
        System.out.printf("\"%s\" matches \"%s\"\n", s, regex);
      else
        System.out.printf("\"%s\" doesn't match \"%s\"\n", s, regex);
    }

  }

}
