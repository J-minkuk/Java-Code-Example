package com.study.sort.quick.comparator;

public class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
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
    if (obj instanceof Person == false) return false;
    Person person = (Person) obj;
    return (this.name == null ? person.name == null : this.name.equals(person.name))
            && this.age == person.age;
  }

  @Override
  public String toString() {
    return String.format("Person[name: %s, age: %d]", name, age);
  }

}
