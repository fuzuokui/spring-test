package com.fuzuokui.spring.circlereference;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorTestMain {

    public static void main(String[] args) throws Throwable {
        try {
            new ClassPathXmlApplicationContext("circlereference/constructor.xml");
        } catch (Exception e){
            Throwable e1 = e.getCause().getCause().getCause();
            throw e1;
        }
    }
}
