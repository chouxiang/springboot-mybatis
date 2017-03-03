package com.xzhang.activemq.config.queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Queue;

/**
 * Created by Administrator on 2017/3/2 0002.
 */
@Configuration
@EnableJms
public class QueueMQConfig1 {

    @Bean
    public Queue queue1(){
        return new ActiveMQQueue("sample.queue1");
    }

}
