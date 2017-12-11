package com.fuzuokui.spring.replacedMethod;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @Author: zuokui.fu
 * @Description:
 * @Date: Created in 16:17 2017/12/11
 * @Modified By:
 */
public class TestMethodReplacer implements MethodReplacer {

    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("我替换掉了原来的方法");
        return null;
    }
}
