package com.fuzuokui.spring.circlereference;

public class TestA {

    private TestB testB;

    public TestA(TestB testB){
        this.testB = testB;
    }

    public TestA() {
    }

    public void a(){
        testB.b();
    }

    public TestB getTestB() {
        return testB;
    }

    public void setTestB(TestB testB) {
        this.testB = testB;
    }
}
