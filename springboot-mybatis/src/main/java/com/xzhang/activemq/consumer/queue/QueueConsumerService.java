package com.xzhang.activemq.consumer.queue;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/3/2 0002.
 * desc : 定义一个点对点的消息消费类
 */
@Service
public class QueueConsumerService {

    private String text;

    //监听sample.queue消息
    @JmsListener(destination = "sample.queue")
    public void receiveQueue(String text) {
        this.text = text;
        System.out.println(text);
    }

    public String receive() {
        return text;
    }

}
