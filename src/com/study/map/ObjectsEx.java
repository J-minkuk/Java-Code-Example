package com.study.map;

import java.util.HashMap;
import java.util.Map;

public class ObjectsEx {

    public static void main(String[] args) {
        Map<Person, Integer> map = new HashMap<Person, Integer>();
        map.put(new Person("홍길동", 18), 101);
        map.put(new Person("임꺽정", 19), 102);

        // Person 클래스에 equals와 hashCode 메소드가 재정의 되어 있지 않으면
        // key를 찾지 못하여 null이 출력된다.
        System.out.println(map.get(new Person("홍길동", 18)));
        System.out.println(map.get(new Person("임꺽정", 19)));
    }

}