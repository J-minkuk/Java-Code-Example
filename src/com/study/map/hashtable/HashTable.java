package com.study.map.hashtable;

public class HashTable {

  private static final int SIZE = 11;
  private Node[] a;

  public HashTable() {
    a = new Node[SIZE];
  }

  public void add(int value) {
    int index = value % SIZE;
    a[index] = new Node(value, a[index]);
  }

  public void remove(int value) {
    int index = value % SIZE;
    a[index] = Node.remove(a[index], value);
  }

  public boolean contains(int value) {
    int index = value % SIZE;
    return Node.contains(a[index], value);
  }

}
