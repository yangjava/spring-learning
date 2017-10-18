package com.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.event.MailSender;

/**
 */
public class MailSendEventTest {
    @Test
    public void testSendMail() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring-event.xml");
        MailSender mailSender = (MailSender) applicationContext.getBean("mailSender");
        mailSender.sendMail("yangjava2014@163.com");
    }
}
