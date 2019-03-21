package drejinx.springframework.demo.services.jms.jms;

public interface JmsTextMessageService {
    void sendTextMessage(String msg); // no access modifier on an interface bum!!!

}
