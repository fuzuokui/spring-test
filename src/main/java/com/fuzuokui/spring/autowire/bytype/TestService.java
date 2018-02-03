package com.fuzuokui.spring.autowire.bytype;

import com.fuzuokui.spring.model.Test;

public class TestService {

    private TestDao testDao;

    public void test(){
        testDao.test();
    }


    public TestDao getTestDao() {
        return testDao;
    }

    public void setTestDao(TestDao testDao) {
        this.testDao = testDao;
    }
}
