package com.fuzuokui.spring.circlereference;

public class TestC {

    private TestA testA;

    public TestC(TestA testA){
        this.testA = testA;
    }

    public TestC() {
    }

    public void c(){
        testA.a();
    }

    public TestA getTestA() {
        return testA;
    }

    public void setTestA(TestA testA) {
        this.testA = testA;
    }
}
