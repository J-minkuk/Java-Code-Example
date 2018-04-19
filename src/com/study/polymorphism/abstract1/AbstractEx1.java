package com.study.polymorphism.abstract1;

abstract class Parent {
    public void method1() {
        System.out.println("Parent method1()");
    }
    public abstract void method2();
}

class ChildOne extends Parent {
    @Override
    public void method1() {
        System.out.println("ChildOne method1()");
    }
    @Override
    public void method2() {
        System.out.println("ChildOne method2()");
    }
}

class ChildTwo extends Parent {
    @Override
    public void method1() {
        System.out.println("ChildTwo method1()");
    }
    @Override
    public void method2() {
        System.out.println("ChildTwo method2()");
    }
}

class ChildThree extends Parent {
    @Override
    public void method2() {
        System.out.println("ChildThree method2()");
    }
}

public class AbstractEx1 {

    static void callMdoSomething(Parent parent) {
        parent.method1();
        parent.method2();
    }

    public static void main(String[] args) {
        ChildOne obj1 = new ChildOne();
        ChildTwo obj2 = new ChildTwo();
        ChildThree obj3 = new ChildThree();

        callMdoSomething(obj1);
        callMdoSomething(obj2);
        callMdoSomething(obj3);
    }

}