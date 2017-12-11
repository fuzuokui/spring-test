package com.fuzuokui.spring.lookup;

/**
 * @Author: zuokui.fu
 * @Description:
 * @Date: Created in 15:41 2017/12/11
 * @Modified By:
 */
public class Teacher extends User {

    @Override
    public void showMe(){
        System.out.println("I am a teacher");
    }
}
