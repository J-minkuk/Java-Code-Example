package com.study.hashcode.equals;

public class LikeLion {

  private String name;
  private int age;

  public LikeLion(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof LikeLion) {
      LikeLion likeLion = (LikeLion) obj;
      return (this.age == likeLion.getAge()) && (this.name.equals(likeLion.getName()));
    }
    else return false;
  }

  @Override
  public int hashCode() {
    return this.age + this.name.hashCode();
  }

}