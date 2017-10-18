package com.spring.event;

import org.springframework.context.ApplicationListener;

/**
 * 事件监听器
 */
public class MailSendListener implements ApplicationListener<MailSendEvent> {
    /**
     * 对MailSendEvent事件进行处理
     *
     * @param event
     */
    public void onApplicationEvent(MailSendEvent event) {
        MailSendEvent mse = (MailSendEvent) event;
        System.out.println("MailSendListener:向" + mse.getTo() + "发送完一封邮件");
    }
}
