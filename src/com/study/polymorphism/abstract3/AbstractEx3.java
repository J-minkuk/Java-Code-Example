package com.study.polymorphism.abstract3;

abstract class Parent {
    public static final double PI = 3.141592;

    public abstract void method1();
    public abstract void method2();
}

// Child 클래스는 method2를 재정의하지 않았기 때문에 abstract 클래스이어야 한다.
class Child extends Parent {
    @Override
    public void method1() {
        System.out.println("Child method1()");
    }
    @Override
    public void method2() {
        System.out.println("Child method2()");
    }
}

// method1은 이미 Child 클래스에서 재정의하였으므로 method2만 하면 된다.
class GrandChild extends Child {
    @Override
    public void method2() {
        System.out.println("GrandChild method2()");
    }
}

public class AbstractEx3 {

    static void doSomething(Parent parent) {
        parent.method1();
        parent.method2();
    }

    public static void main(String[] args) {
        doSomething(new GrandChild());
    }

}