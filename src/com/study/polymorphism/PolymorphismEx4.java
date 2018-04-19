package com.study.polymorphism;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class PolymorphismEx4 {

    static int getSum(List<Integer> list) {
        int sum = 0;
        for(Integer i : list) sum = sum + i;
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        Random random = new Random();
        for(int i=0; i < 10; ++i) {
            list1.add(random.nextInt(20));
            list2.add(random.nextInt(20));
        }

        System.out.printf("%s 합계: %d\n", list1.toString(), getSum(list1));
        System.out.printf("%s 합계: %d\n", list2.toString(), getSum(list2));

    }

}