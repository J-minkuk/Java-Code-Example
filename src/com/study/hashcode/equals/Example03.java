package com.study.hashcode.equals;

public class Example03 {
  public static void main(String[] args) {
    LikeLion lion1 = new LikeLion("아기사자", 20);
    LikeLion lion2 = new LikeLion("아기사자", 20);

    System.out.println("lion1.equals(lion2) : " + lion1.equals(lion2));
    System.out.println("lion1.hashCode() : " + lion1.hashCode());
    System.out.println("lion2.hashCode() : " + lion2.hashCode());
  }
}
