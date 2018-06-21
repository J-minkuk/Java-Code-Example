package com.study.hashcode.equals;

public class Example02 {
  public static void main(String[] args) {
    Object obj1 = new Object();
    Object obj2 = new Object();
    Object obj3 = new Object();

    System.out.println("obj1.equals(obj2) : " + obj1.equals(obj2));
    System.out.println("obj1.equals(obj3) : " + obj1.equals(obj3));
    System.out.println("obj2.equals(obj3) : " + obj1.equals(obj3));
    System.out.println("obj1.hashCode() : " + obj1.hashCode());
    System.out.println("obj2.hashCode() : " + obj2.hashCode());
    System.out.println("obj3.hashCode() : " + obj3.hashCode());

    String str1 = "멋사";
    String str2 = "멋사";
    String str3 = "멋사";

    System.out.println("str1.equals(str2) : " + str1.equals(str2));
    System.out.println("str1.equals(str3) : " + str1.equals(str3));
    System.out.println("str2.equals(str3) : " + str2.equals(str3));
    System.out.println("str1.hashCode() : " + str1.hashCode());
    System.out.println("str2.hashCode() : " + str2.hashCode());
    System.out.println("str3.hashCode() : " + str3.hashCode());
  }
}