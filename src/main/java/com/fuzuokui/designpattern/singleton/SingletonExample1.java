package com.fuzuokui.designpattern.singleton;

public class SingletonExample1 {

    private SingletonExample1() {
        System.out.println("SingletonExample1 Constructor");
    }

    private static class SingletonHolder{
        private static final SingletonExample1 instance = new SingletonExample1();
    }

    public static SingletonExample1 getInstance(){
        return SingletonHolder.instance;
    }
}
