package com.petfeeder.petfeeder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.messaging.Message;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.TextMessage;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class SolaceMessageConsumer {

    @Autowired
    private JmsTemplate jmsTemplate;

    @JmsListener(destination = "test")
    public void receiveMessage(Message message) {

        Date receiveTime = new Date();

            System.out.println(message.getPayload());
    }

    @Scheduled(fixedRate = 5000)
    public void sendEvent() throws Exception {
        String msg = "Hello World " + System.currentTimeMillis();
        jmsTemplate.convertAndSend("test/topic", msg);
    }
}
