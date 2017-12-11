package com.fuzuokui.spring.replacedMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: zuokui.fu
 * @Description:
 * @Date: Created in 16:23 2017/12/11
 * @Modified By:
 */
public class TestMain {

    //replaced-method标签使用示例
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("replacedmethod/replaceMethodTest.xml");
        TestChangeMethod changeMethod =(TestChangeMethod) ac.getBean("testChangeMethod");
        changeMethod.changeMe();
    }
}
