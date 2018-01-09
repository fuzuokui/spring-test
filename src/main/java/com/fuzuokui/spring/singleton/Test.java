package com.fuzuokui.spring.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: zuokui.fu
 * @Description:
 * @Date: Created in 15:47 2018/1/5
 * @Modified By:
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("singleton/singleton.xml");
        ac.getBean("dataSource1");
//        System.out.println(ac.getBean("dataSource1") == ac.getBean("dataSource2"));
    }
}
