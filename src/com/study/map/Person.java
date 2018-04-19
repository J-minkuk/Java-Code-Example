package com.study.map;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Person(\"%s\" %d)", name, age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj instanceof Person == false) return false;
        Person p = (Person)obj;
        return this.age == p.age && Objects.equals(this.name, p.name);
    }

}