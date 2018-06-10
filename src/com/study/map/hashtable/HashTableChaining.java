package com.study.map.hashtable;

public class HashTableChaining {

  public static void main(String[] args) throws Exception {
    int maxValue = 200;
    int[] data = { 1, 12, 2, 3, 5, 7, 14, 19, 22 };
    HashTable hashTable = new HashTable();

    for (int i = 0; i < data.length; ++i) {
      hashTable.add(data[i]);
    }

    hashTable.remove(11);
    hashTable.remove(44);

    for (int i = 1; i <= maxValue; ++i) {
      if (hashTable.contains(i)) {
        System.out.println(i);
      }
    }
  }

}
