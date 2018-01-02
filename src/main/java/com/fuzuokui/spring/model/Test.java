package com.fuzuokui.spring.model;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2017/12/10.
 */
public class Test {

    public static void main(String[] args) {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("service-context.xml"));
        Person person = (Person) factory.getBean("person");
        person.print();

        //other test
        try {
            ClassLoader cl = Thread.currentThread().getContextClassLoader();
            ClassLoader cl1 = Test.class.getClassLoader();
            System.out.println("=================");
        }
        catch (Throwable ex) {
            // Cannot access thread context ClassLoader - falling back...
        }




    }
}
