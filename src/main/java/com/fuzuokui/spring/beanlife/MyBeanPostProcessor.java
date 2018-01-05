package com.fuzuokui.spring.beanlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Author: zuokui.fu
 * @Description:
 * @Date: Created in 14:49 2018/1/2
 * @Modified By:
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("7、执行BeanPostProcessor接口的postProcessBeforeInitialization方法。beanName:" + s);
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("10、执行BeanPostProcessor接口的postProcessAfterInitialization方法。beanName:" + s);
        return o;
    }
}
