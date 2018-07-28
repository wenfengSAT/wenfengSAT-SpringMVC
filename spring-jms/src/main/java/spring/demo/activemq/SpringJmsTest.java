package spring.demo.activemq;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class SpringJmsTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-jms.xml");

        SpringPublisher publisher = (SpringPublisher) applicationContext.getBean("springProducer");
        publisher.send();

        SpringConsumer consumer = (SpringConsumer) applicationContext.getBean("springConsumer");
        consumer.receive();

    }
}
