package com.fuzuokui.spring.lookup;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @Author: zuokui.fu
 * @Description:
 * @Date: Created in 15:45 2017/12/11
 * @Modified By:
 */
public class TestMain {

    //lookup-method的使用示例
    public static void main(String[] args) {
        BeanFactory f = new XmlBeanFactory(new ClassPathResource("service-context.xml"));
        GetBeanTest getBeanTest = (GetBeanTest) f.getBean("getBeanTest");
        getBeanTest.showMe();
    }



}
