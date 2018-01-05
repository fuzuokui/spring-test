package com.fuzuokui.spring.beanlife;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryTestMain {

    public static void main(String[] args) {
        ConfigurableBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beanlife/aware.xml"));
        beanFactory.addBeanPostProcessor(new MyBeanPostProcessor());
        beanFactory.getBean("user1");
        System.out.println("关闭容器");
        beanFactory.destroySingletons();
    }
}
