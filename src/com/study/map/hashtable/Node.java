package com.study.map.hashtable;

public class Node {

  private int value;
  private Node next;

  public Node(int value, Node next) {
    this.value = value;
    this.next = next;
  }

  public static Node remove(Node node, int value) {
    if (node == null) return null;
    if (node.value == value) return node.next;
    node.next = remove(node.next, value);
    return node;
  }

  public static boolean contains(Node node, int value) {
    if (node == null) return false;
    if (node.value == value) return true;
    return contains(node.next, value);
  }

}
