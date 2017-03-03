package com.xzhang.activemq.consumer.queue;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/3/2 0002.
 */
@Service
public class QueueConsumerService1 {

    @JmsListener(destination = "sample.queue")
    public void receiveQueue(String text) {
        String msg = text;
        System.out.println(msg+"[测试sample.queue]");
    }

    @JmsListener(destination = "sample.queue1")
    public void receiveQueue1(String text) {
        String msg = text;
        System.out.println(msg+"[测试sample.queue1]");
    }

    public String receive1() {
        return "";
    }

}
