package com.fuzuokui.spring.placeholder;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @Author: zuokui.fu
 * @Description:
 * @Date: Created in 18:23 2017/12/25
 * @Modified By:
 */
public class BeanFactoryTest {

    public static void main(String[] args) {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("placeholder/service-context.xml"));
        System.out.println("BeanFactory容器初始化完成");
        Group group = (Group)beanFactory.getBean("group");
    }
}
