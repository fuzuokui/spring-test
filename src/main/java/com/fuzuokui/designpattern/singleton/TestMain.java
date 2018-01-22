package com.fuzuokui.designpattern.singleton;

public class TestMain {

    public static void main(String[] args) {
        SingletonExample1 singleton1 = SingletonExample1.getInstance();
        SingletonExample1 singleton2 = SingletonExample1.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}
