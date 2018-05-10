package com.study.regex;

public class Example08 {

  public static void main(String[] args) {
    String regex = "0(2|[1-9]{2})-[0-9]{3}-[0-9]{4}";
    String s1 = "02-123-1234";
    String s2 = "045-123-0123";
    String s3 = "45-123-1234";


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