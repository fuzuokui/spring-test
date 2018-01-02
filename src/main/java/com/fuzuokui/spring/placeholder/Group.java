package com.fuzuokui.spring.placeholder;

/**
 * @Author: zuokui.fu
 * @Description:
 * @Date: Created in 15:47 2017/12/25
 * @Modified By:
 */
public class Group {

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString(){
        return userName;
    }

}
