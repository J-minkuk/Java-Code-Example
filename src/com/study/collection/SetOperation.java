package com.study.collection;

import java.util.ArrayList;
import java.util.Arrays;

/*
ArrayList를 이용한 집합 연산
 */

class StringSet {

    ArrayList<String> list = new ArrayList<String>();

    public void add(String s) {
        list.add(s);
    }

    public void remove(String s) {
        list.remove(s);
    }

    public boolean contains(String s) {
        return list.contains(s);
    }

    public StringSet union(StringSet set) {
        StringSet newSet = new StringSet();
        newSet.list.addAll(this.list);
        newSet.list.removeAll(set.list);
        newSet.list.addAll(set.list);
        return newSet;
    }

    public StringSet intersection(StringSet set) {
        StringSet newSet = new StringSet();
        newSet.list.addAll(this.list);
        newSet.list.retainAll(set.list);
        return newSet;
    }

    public StringSet difference(StringSet set) {
        StringSet newSet = new StringSet();
        newSet.list.addAll(this.list);
        newSet.list.removeAll(set.list);
        return newSet;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof StringSet == false) return false;
        StringSet set = (StringSet) obj;
        return this.list.equals(set.list);
    }

    public String[] toArray() {
        return list.toArray(new String[0]);
    }

}

public class SetOperation {

    static void print(String msg, StringSet set) {
        String[] a = set.toArray();
        Arrays.sort(a);
        String temp = Arrays.toString(a);
        System.out.printf("%s: %s\n", msg, temp);
    }

    public static void main(String[] args) {

        StringSet A = new StringSet();
        for(int i = 0; i < 20; ++i) {
            String s = String.format("%02d", i);
            A.add(s);
        }
        print("A", A);

        StringSet B = new StringSet();
        for(int i=0; i < 20; i += 2) {
            String s = String.format("%02d", i);
            B.add(s);
        }
        print("B", B);

        StringSet C = new StringSet();
        for(int i=0; i < 20; i += 3) {
            String s = String.format("%02d", i);
            C.add(s);
        }
        print("C", C);

        print("A 합집합 B", A.union(B));
        print("A 교집합 B", A.intersection(B));
        print("A 합집합 C", A.union(C));
        print("A 교집합 C", A.intersection(C));
        print("B 합집합 C", B.union(C));
        print("B 교집합 C", B.intersection(C));
        print("A 차집합 B", A.difference(B));
    }

}
