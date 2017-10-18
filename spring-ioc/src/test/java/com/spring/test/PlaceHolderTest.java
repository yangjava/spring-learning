package com.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.placeholder.MyDataSource;

import java.sql.Connection;

import javax.sql.DataSource;

/**
 */
public class PlaceHolderTest {
    @Test
    public void testPlaceHolder() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-placeholder.xml");
        DataSource ds = ctx.getBean(DataSource.class);
        Connection conn = ds.getConnection();

        System.out.println(ctx.getBean(MyDataSource.class));
    }
}
