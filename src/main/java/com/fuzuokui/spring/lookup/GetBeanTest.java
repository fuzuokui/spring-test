package com.fuzuokui.spring.lookup;

/**
 * @Author: zuokui.fu
 * @Description:
 * @Date: Created in 15:42 2017/12/11
 * @Modified By:
 */
public abstract class GetBeanTest {

    public void showMe(){
        this.getUserBean().showMe();
    }

    public abstract User getUserBean();
}
