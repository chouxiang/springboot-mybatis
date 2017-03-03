package com.xzhang.activemq.consumer.topic;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.annotation.JmsListeners;

/**
 * Created by Administrator on 2017/3/2 0002.
 * desc : 定义一个发布/订阅的消息消费类
 */
public class TopicConsumerService {

    private String text;

    @JmsListeners(
            @JmsListener(destination = "sample.topic")
    )
    public void receiveTopic(String text) {
        this.text = text;
        System.out.println(text+"xzhang");
    }

    public String receive() {
        return text;
    }

}
