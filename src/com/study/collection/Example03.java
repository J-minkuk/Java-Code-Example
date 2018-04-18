package com.study.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class Example03 {

    static void printCollection(Collection<String> c) {
        String[] a = c.toArray(new String[0]);
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {

        Collection<String> c1 = new LinkedList<>();
        Collection<String> c2 = new ArrayList<>();

        c1.add("one");
        c1.add("two");

        c2.addAll(c1);
        c2.add("three");

        printCollection(c1);
        printCollection(c2);

    }

}
