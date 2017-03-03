package com.xzhang.controller.activemq;

import com.xzhang.activemq.produce.queue.QueueProduceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/3/2 0002.
 * desc : MQ的controller类
 */
@Controller
@RequestMapping("mqController")
public class MQController {

    @Autowired
    private QueueProduceService queueProduceService;

    @RequestMapping("queueSend.do")
    public String queueSend(HttpServletRequest request, HttpServletResponse response){
        queueProduceService.send("sample.queue: queueSend测试....");
        return "/activemq/queueSend";
    }

    @RequestMapping("queueSend1.do")
    public String queueSend1(HttpServletRequest request, HttpServletResponse response){
        queueProduceService.send1("sample.queue1: queueSend1测试....");
        request.setAttribute("msg","queueSend1测试....");
        return "/activemq/queueSend1";
    }

    //-------------------------------------------------------

    /**
     * desc : 测试发布/订阅功能
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("topicSend.do")
    public String topicSend(HttpServletRequest request, HttpServletResponse response){
        queueProduceService.send("sample.topic: topicSend测试....");
        request.setAttribute("msg","topicSend测试....");
        return "/activemq/topicSend";
    }




}
