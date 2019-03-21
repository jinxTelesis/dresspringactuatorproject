package drejinx.springframework.demo.services.jms.jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Queue;

@Service
public class JmsTextMessageServiceImpl {

    private Queue textMessageQueue;
    private JmsTemplate jmsTemplate;

    @Autowired
    public void setTextMessageQueue(javax.jms.Queue textMessageQueue) { this.textMessageQueue = textMessageQueue;}

    public void SetJmsTemplate(JmsTemplate jmsTemplate) {this.jmsTemplate = jmsTemplate;}

    public void snedTextMessage(String msg) {this.jmsTemplate.convertAndSend(this.textMessageQueue, msg);}

}
