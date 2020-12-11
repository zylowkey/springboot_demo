package com.goldcard.springboot_demo;

import com.goldcard.springboot_demo.pojo.ScopeBean;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ScopeBeanTest {
    private  AnnotationConfigApplicationContext ctx;

    @Before
    public void before(){
        ctx = new AnnotationConfigApplicationContext(SpringbootDemoApplication.class);
    }
    @Test
    public void test(){
        ScopeBean bean = ctx.getBean(ScopeBean.class);
        ScopeBean bean1 = ctx.getBean(ScopeBean.class);
        System.out.println(bean == bean1);
        System.out.println("bean=="+bean.hashCode()+",bean1=="+bean1.hashCode());
    }
}
