package com.fuzuokui.spring.autowire.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("autowire/byType/byType.xml");
        TestService service = (TestService) ac.getBean("service");
        service.test();
        System.out.println("关闭容器");
        ((ClassPathXmlApplicationContext)ac).close();

    }
}
