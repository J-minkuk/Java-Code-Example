package com.study.polymorphism.Interface;

interface Parent {
    double PI = 3.141592;

    void method1();
    void method2();
}

class ChildOne implements Parent {
    @Override
    public void method1() {
        System.out.println("ChildOne method1()");
    }
    @Override
    public void method2() {
        System.out.println("ChildOne method2()");
    }
}

class ChildTwo implements Parent {
    @Override
    public void method1() {
        System.out.println("Child2 method1()");
    }
    @Override
    public void method2() {
        System.out.println("Child2 method2()");
    }
}

public class InterfaceEx1 {

    static void doSomething(Parent p) {
        p.method1();
        p.method2();
    }

    public static void main(String[] args) {
        ChildOne obj1 = new ChildOne();
        ChildTwo obj2 = new ChildTwo();
        doSomething(obj1);
        doSomething(obj2);
    }

}