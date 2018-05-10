package com.study.regex.file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example01 {

  static String readTextFile(String path) throws IOException {
    try(BufferedReader reader = new BufferedReader(
            new InputStreamReader(new FileInputStream(path), "EUC-KR"))) {
      StringBuilder builder = new StringBuilder();
      String s = reader.readLine();

      while (s != null) {
        builder.append(s);
        builder.append("\n");
        s = reader.readLine();
      }
      return builder.toString();
    }
  }

  public static void main(String[] args) throws IOException {
    String path = "d:/temp/홈페이지_게시판.html";
    String s = readTextFile(path);
    System.out.println(s);
  }

}