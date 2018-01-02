package com.fuzuokui.spring.placeholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: zuokui.fu
 * @Description:
 * @Date: Created in 15:43 2017/12/25
 * @Modified By:
 */
public class Test {

    public static void main(String[] args) {
        System.setProperty("eos", "fffffffffffff");
        ApplicationContext ac = new ClassPathXmlApplicationContext("placeholder/service-context.xml");
        Group group = (Group) ac.getBean("group");
        System.out.println(group.toString());
    }
}
