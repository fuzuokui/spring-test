package com.fuzuokui.spring.singleton;

/**
 * @Author: zuokui.fu
 * @Description:
 * @Date: Created in 14:34 2018/1/5
 * @Modified By:
 */
public class DataSource {

    private String url;
    private String username;
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
