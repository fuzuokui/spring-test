package com.fuzuokui.spring.constructorarg;

/**
 * @Author: zuokui.fu
 * @Description:
 * @Date: Created in 16:43 2017/12/11
 * @Modified By:
 */
public class Person {

    private String name;
    private Integer age;

    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
