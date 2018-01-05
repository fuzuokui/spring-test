package com.fuzuokui.spring.beanlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Author: zuokui.fu
 * @Description:
 * @Date: Created in 14:06 2018/1/2
 * @Modified By:
 */
public class User implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean{

    private String userId;
    private String userName;
    private String password;

    static {
        System.out.println("1、执行static代码块");
    }

    public User(){
        System.out.println("2、执行默认构造函数");
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        System.out.println("3、设置bean的userName属性为：" + userName);
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println(String.format("4、执行BeanNameAware接口的setBeanName方法。bean的id属性是%s", s));
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("5、执行BeanFactoryAware接口的setBeanFactory方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("8、执行InitializingBean接口的afterPropertiesSet方法");
    }

    public void init(){
        System.out.println("9、执行bean的init-method方法");
    }

    public void destory(){
        System.out.println("12、执行bean的destory-method方法");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("6、执行ApplicationContextAware接口的setApplicationContext方法");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("11、执行DisposableBean接口的destroy方法");
    }
}
