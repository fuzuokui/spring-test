package com.fuzuokui.spring.circlereference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterSingletonTestMain {

    public static void main(String[] args) throws Throwable {
        try {
            ApplicationContext ac = new ClassPathXmlApplicationContext("circlereference/settersingleton.xml");
            System.out.println(ac.getBean("testA"));
            System.out.println(ac.getBean("testB"));
            System.out.println(ac.getBean("testC"));
        } catch (Exception e){
            Throwable e1 = e.getCause().getCause().getCause();
            throw e1;
        }
    }
}
