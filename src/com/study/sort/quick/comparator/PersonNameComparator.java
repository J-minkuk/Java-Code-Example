package com.study.sort.quick.comparator;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {
  @Override
  public int compare(Person p1, Person p2) {
    int compareValue = p1.getName().compareTo(p2.getName());
    if (compareValue != 0) return compareValue;
    return p1.getAge() - p2.getAge();
  }
}
