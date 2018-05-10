package com.study.regex;

public class Example12 {

  public static void main(String[] args) {

    String regex = "[a-zA-Z]+@[a-zA-Z]+\\.com";
    String s1 = "a@a.com";
    String s2 = "aAAaaaa@Bcdcdd.com";
    String s3 = "aaaBF@1.com";

    if(s1.matches(regex))
      System.out.println("일치한다.");
    else
      System.out.println("아니다");

    if(s2.matches(regex))
      System.out.println("일치한다.");
    else
      System.out.println("아니다");

    if(s3.matches(regex))
      System.out.println("일치한다.");
    else
      System.out.println("아니다");

  }

}