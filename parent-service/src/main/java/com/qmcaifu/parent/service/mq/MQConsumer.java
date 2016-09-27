package com.qmcaifu.parent.service.mq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

/**
 * Created by nihao on 2016/9/22.
 */
@Service
public class MQConsumer {

    public static final Logger logger = LoggerFactory.getLogger(MQConsumer.class);

    @RabbitListener(queues = {"queue.parent.hello"})
    public void hello(String msg){
        try{
            System.out.println(msg);
        } catch (Exception e) {
            logger.error("msg = {}", e);
        }
    }
}
