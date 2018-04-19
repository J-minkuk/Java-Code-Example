package com.study.polymorphism;

public class PolymorphismEx1 {

    public static void main(String[] args) {
        Parent parent;
        ChildOne obj1 = new ChildOne();
        ChildTwo obj2 = new ChildTwo();
        ChildThree obj3 = new ChildThree();

        obj1.method1();

        parent = obj1;
        parent.method1();

        parent = obj2;
        parent.method1();

        parent = obj3;
        parent.method1();
    }

}