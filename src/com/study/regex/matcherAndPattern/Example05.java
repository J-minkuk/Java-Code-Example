package com.study.regex.matcherAndPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example05 {

  public static void main(String[] args) {
    String[] a = new String[] {
            "http://localhost:8080/test/list.jsp?pg=3&sz=15",
            "http://localhost:8080/test/list.jsp?pg=9&sz=10",
            "http://localhost:8080/test/list.jsp?pg=25&sz=20&od=1"
    };

    String regex = "(\\?|&)([a-z]+)=([0-9]+)";
    Pattern pattern = Pattern.compile(regex);

    for (String s : a) {
      System.out.printf("\n\n%s\n", s);

      Matcher matcher = pattern.matcher(s);

      while (matcher.find())
        System.out.printf("group1:%s  group2:%s  group3:%s\n",
                matcher.group(1), matcher.group(2), matcher.group(3));
    }
  }

}