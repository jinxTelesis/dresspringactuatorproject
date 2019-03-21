package drejinx.springframework.demo.services.jms.jms;

import org.springframework.stereotype.Component;

@Component
public class JmsTextMessageListener {

    public void onMessage(String msg){ System.out.println("#### " + msg + " ###");}
}
