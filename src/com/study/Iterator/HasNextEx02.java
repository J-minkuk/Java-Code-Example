package com.study.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class HasNextEx02 {

    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();

        for (int i = 0; i < 10; ++i) {
            String s = String.format("%02d ", i);
            c.add(s);
        }

        for (String s : c)
            System.out.print(s);

        System.out.println();

        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.print(s);
        }
    }

}