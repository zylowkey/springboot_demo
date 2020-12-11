package com.goldcard.springboot_demo.service;

import com.goldcard.springboot_demo.pojo.DataBaseProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
@Service
public class Test {
    @Autowired
    DataBaseProperties dataBaseProperties;

    @PostConstruct
    public void test(){
        System.out.println(dataBaseProperties.toString());
    }
}
