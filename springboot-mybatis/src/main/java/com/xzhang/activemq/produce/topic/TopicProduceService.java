package com.xzhang.activemq.produce.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Topic;

/**
 * Created by Administrator on 2017/3/2 0002.
 * desc : 定义一个发布/订阅的消息生成者
 */
@Service
public class TopicProduceService {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    //获取定义Bean类型的Topic
    @Autowired
    private Topic topic;

    public void send(String msg){
        this.jmsMessagingTemplate.convertAndSend(topic,msg);
    }

}
