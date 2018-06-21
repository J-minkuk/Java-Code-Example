package com.study.hashcode.equals;

public class Example01 {
  public static void main(String[] args) {
    Object obj = new Object();
    System.out.println("(1) 참조변수 obj 출력값: " + obj);
    System.out.println("(2) obj 객체의 hashcode 출력값: " + obj.hashCode());

    LikeLion lion = new LikeLion("아기사자", 20);
    System.out.println("(3) 참조변수 lion 출력값: " + lion);
    System.out.println("(4) lion 객체의 hashcode 출력값: " + lion.hashCode());

    String str1 = "멋사";
    System.out.println("(5) \"멋사\" 객체의 hashcode 출력값: " + str1.hashCode());

    String str2 = "멋사";
    System.out.println("(6) \"멋사\" 객체의 hashcode 출력값: " + str2.hashCode());
  }
}