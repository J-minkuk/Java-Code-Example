package com.study.regex;

public class Example10 {

  public static void main(String[] args) {
    String regex = "0x[0-9A-F]{2}";
    String s1 = "0x00";
    String s2 = "0x0A";
    String s3 = "0xAA";
    String s4 = "0x0a";

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

    if(s4.matches(regex))
      System.out.println("일치한다.");
    else
      System.out.println("아니다");

  }

}