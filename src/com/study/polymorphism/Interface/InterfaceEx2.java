package com.study.polymorphism.Interface;

interface A {
    void method1();
}

interface B extends A {
    void method2();
}

class S1 implements A {
    @Override
    public void method1() {
        System.out.println("S1 method1()");
    }
}

class S2 implements B {
    @Override
    public void method1() {
        System.out.println("S2 method1()");
    }
    @Override
    public void method2() {
        System.out.println("S2 method2()");
    }
}

public class InterfaceEx2 {

    static void print1(A obj) {
        obj.method1();
    }

    static void print2(B obj) {
        obj.method1();
        obj.method2();
    }

    public static void main(String[] args) {
        S1 o1 = new S1();
        S2 o2 = new S2();
        print1(o1);
        print1(o2);
        print2(o2);
    }

}