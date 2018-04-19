package com.study.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class HasPreviousEx02 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        for(int i=0; i < 10; ++i) {
            String s = String.format("%02d", i);
            list.add(s);
        }

        for(int i = list.size() - 1; i >= 0; --i)
            System.out.print(list.get(i)+" ");
        System.out.println();

        ListIterator<String> iterator = list.listIterator(list.size());
        while(iterator.hasPrevious()) {
            String s = iterator.previous();
            System.out.print(s+ " ");
        }

    }

}