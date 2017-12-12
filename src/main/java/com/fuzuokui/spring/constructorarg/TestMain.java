package com.fuzuokui.spring.constructorarg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: zuokui.fu
 * @Description:
 * @Date: Created in 16:48 2017/12/11
 * @Modified By:
 */
public class TestMain {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("constructorarg/constructorArg.xml");
        Person person = (Person) ac.getBean("person");
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }
}
