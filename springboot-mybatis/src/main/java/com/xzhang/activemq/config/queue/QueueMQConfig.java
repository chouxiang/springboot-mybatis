package com.xzhang.activemq.config.queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Queue;

/**
 * Created by Administrator on 2017/3/2 0002.
 * desc : 定义一个名为“sample.queue”的点对点消息
 */
@Configuration
@EnableJms
public class QueueMQConfig {

    //@Bean将QueueMQConfig注入
    @Bean
    public Queue queue(){
        return new ActiveMQQueue("sample.queue");
    }

}
