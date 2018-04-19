package com.study.list;

import java.util.ArrayList;
import java.util.List;

public class Example01 {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("a");
        list1.add("b");
        list1.add(0, "c");
        list1.add(1, "d");
        list2.add("kim");
        list2.add("jo");
        list2.addAll(1, list1);

        for(String s : list2)
            System.out.printf("%s ", s);

        for(int i = 0; i < list2.size(); ++i)
            System.out.printf("%s ", list2.get(i));

        System.out.println(list2.indexOf("jo"));
        System.out.println(list2.indexOf("kim"));

    }

}
