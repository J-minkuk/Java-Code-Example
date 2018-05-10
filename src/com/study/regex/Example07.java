package com.study.regex;

import java.util.Arrays;

public class Example07 {

  public static void main(String[] args) {
    String s = "one; two, three,\t four; \t\nfive..,six";

    String[] a = s.split("[ ,.;\t\n]+");
    String[] b = s.split("[^a-zA-Z]+");

    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));
  }

}