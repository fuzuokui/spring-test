package com.fuzuokui.spring.beanlife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: zuokui.fu
 * @Description:
 * @Date: Created in 14:09 2018/1/2
 * @Modified By:
 */
public class ApplicationContextTestMain {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beanlife/aware.xml");
//        ac.getBean("user1");
        System.out.println("关闭容器");
        ((ClassPathXmlApplicationContext)ac).close();
    }
}
