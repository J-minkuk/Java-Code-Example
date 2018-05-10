package com.study.regex;

public class Example09 {

  public static void main(String[] args) {
    String regex = "\\([1-9][0-9]*\\)";
    String s1 = "(100000)";
    String s2 = "(1)";

    if(s1.matches(regex))
      System.out.printf("\"%s\" 패턴과 \"%s\"는 일치한다.\n", regex, s1);
    else
      System.out.println("아니다");
    if(s2.matches(regex))
      System.out.printf("\"%s\" 패턴과 \"%s\"는 일치한다.\n", regex, s2);
    else
      System.out.println("아니다");
  }

}