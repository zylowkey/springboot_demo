package com.goldcard.springboot_demo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Value(${...}) ${...} 代表占位符，它会读取上下文e 属性值装配到属性中
 * @Value(#{...}) #{...} 代表启用Spring表达式，它将具有运算功能
 */
@Component
//@PropertySource({"classpath:application.properties"})
@ConfigurationProperties("database")
//@EnableConfigurationProperties()
public class DataBaseProperties {
//    @Value("${database.driverName}")
    private String driverName = null;

    private String url = null;

    private String userName = null;

    private String password = null;

    @Value("#{1+2}")
    private int num;

    @Value("#{T(System).currentTimeMillis()}")
    private Long intTime;

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        System.out.println("driverName=="+driverName);
        this.driverName = driverName;
    }

    public String getUrl() {
        return url;
    }
//    @Value("${database.url}")
    public void setUrl(String url) {
        System.out.println("url==="+url);
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }
//    @Value("${database.userName}")
    public void setUserName(String userName) {
        System.out.println("userName==="+userName);
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }
//    @Value("${database.password}")
    public void setPassword(String password) {
        System.out.println("password==="+password);
        this.password = password;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        System.out.println("num==="+num);
        this.num = num;
    }

    public Long getIntTime() {
        return intTime;
    }

    public void setIntTime(Long intTime) {
        this.intTime = intTime;
    }

    @Override
    public String toString() {
        return "DataBaseProperties{" +
                "driverName='" + driverName + '\'' +
                ", url='" + url + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", num=" + num +
                ", intTime=" + intTime +
                '}';
    }
}
