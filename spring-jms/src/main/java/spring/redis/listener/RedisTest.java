package spring.redis.listener;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import spring.redis.publisher.RedisPublisher;

public class RedisTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("redis.xml");

        RedisPublisher publisher = (RedisPublisher) applicationContext.getBean("jedisPublisher");
        publisher.send();

    }
}
