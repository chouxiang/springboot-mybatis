package com.xzhang.activemq.config.topic;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Topic;

/**
 * Created by Administrator on 2017/3/3 0003.
 * desc : 定义一个发布/订阅的topic
 */
@Configuration
@EnableJms
public class TopicMQConfig1 {

    @Bean
    public Topic getTopic(){
        return new ActiveMQTopic("sample.topic1");
    }

}
