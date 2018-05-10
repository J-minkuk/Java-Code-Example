package com.study.regex;

public class Example05 {

  public static void main(String[] args) {

    String[] a = new String[] {
            "http://localhost:8080/test/list.jsp?pg=3&sz=15",
            "http://localhost:8080/test/list.jsp?pg=9&sz=10",
            "http://localhost:8080/test/list.jsp?pg=25&sz=20"
    };

    String regex = "(\\?|&)[a-z]+=[0-9]+";

    for(String s : a) {
      String temp = s.replaceFirst(regex, "");
      System.out.printf("%s => %s\n", s, temp);
    }

  }

}
