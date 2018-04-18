package com.study.collection;

import java.util.*;

public class Example04a {

    static void printCollection(String s, Collection<String> c) {
        String[] a = c.toArray(new String[0]);
        Arrays.sort(a);
        System.out.printf("%s: %s\n", s, Arrays.toString(a));
    }

    public static void main(String[] args) {

        Collection<String> c1 = new Stack<>();
        Collection<String> c2 = new LinkedList<>();
        Collection<String> c3 = new ArrayList<>();

        for(int i=0; i < 20; i += 2) {
            String s = String.format("%02d", i);
            c1.add(s);
        }
        printCollection("c1 (2의 배수)", c1);

        for(int i=0; i < 20; i += 3) {
            String s = String.format("%02d", i);
            c2.add(s);
        }
        printCollection("c2 (3의 배수)", c2);


        c3.clear();
        c3.addAll(c1);
        c3.retainAll(c2);
        printCollection("c1, c2 교집합", c3);

        c3.clear();
        c3.addAll(c1);
        c3.removeAll(c2);
        printCollection("c1, c2 차집합", c3);

        c3.clear();
        c3.addAll(c2);
        c3.removeAll(c1);
        printCollection("c2, c1 차집합", c3);

        c3.clear();
        c3.addAll(c1);
        c3.removeAll(c2);
        c3.addAll(c2);
        printCollection("c1, c2 합집합", c3);

    }
}
