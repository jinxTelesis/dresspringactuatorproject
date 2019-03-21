package drejinx.springframework.demo.services.jms.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Queue;

@Service
public class JmsTextMessageServiceImpl {

    private Queue textMessageQueue;
    private JmsTemplate jmsTemplate;

//    @Autowired
//    public void setTextMessageQueue(Queue textMessageQueue) {
//        this.textMessageQueue = textMessageQueue;
//    }

    @Autowired
    public void setJmsTemplate(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    @Override
    public void sendTextMessage(String msg) {
        this.jmsTemplate.convertAndSend(this.textMessageQueue, msg);
    }

}
