package com.fuzuokui.spring.placeholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: zuokui.fu
 * @Description:
 * @Date: Created in 18:28 2017/12/25
 * @Modified By:
 */
public class ApplicationContextTest {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("placeholder/service-context.xml");
        System.out.println("ApplicationContext初始化完成");
        Group group = (Group)ac.getBean("group");
    }
}
