package com.study.regex;

public class Example11 {

  public static void main(String[] args) {
    String regex = "%[0-9]*[dsfx]";
    String s1 = "%00000000d";
    String s2 = "%12324424234234234x";
    String s3 = "00000d";
    String s4 = "%0a";

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