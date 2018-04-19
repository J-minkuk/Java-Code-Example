package com.study.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class FinalEx01 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i=0; i < 10; ++i)
            list.add(i);

        for(int i : list)
            System.out.print(i+" ");
        System.out.println();

        ListIterator<Integer> iterator = list.listIterator();
        while(iterator.hasNext()) {
            int i = iterator.next();
            if(i % 2 == 0) iterator.remove();
        }

        for(int i : list)
            System.out.print(i+" ");
        System.out.println();

        iterator = list.listIterator();
        while(iterator.hasNext()) {
            int i = iterator.next();
            if(i % 2 == 1) iterator.add(i+1);
        }

        for(int i : list)
            System.out.print(i+" ");
        System.out.println();

    }

}