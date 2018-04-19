package com.study.polymorphism;

public class PolymorphismEx2 {

    static void doSomething(Parent parent) {
        parent.method1();
    }

    public static void main(String[] args) {
        ChildOne obj1 = new ChildOne();
        ChildTwo obj2 = new ChildTwo();
        ChildThree obj3 = new ChildThree();

        obj1.method1();

        doSomething(obj1);
        doSomething(obj2);
        doSomething(obj3);

    }

}