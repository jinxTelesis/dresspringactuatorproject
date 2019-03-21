package drejinx.springframework.demo.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;

@Configuration
public class JMSConfigClass {

    public static final String textMsgQueue = "text.messagequeue";

    public Queue textMessageQueue(){return  new ActiveMQQueue(textMsgQueue);
    }

}
