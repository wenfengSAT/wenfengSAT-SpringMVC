package spring.redis.listener;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisPubSub;

@Component("jedisPubSub")
public class RedisListener extends JedisPubSub {
    @Override
    public void onPMessage(String pattern, String channel, String message) {
        if (channel.equals("log")) {
            JSONObject mqMessage = JSONObject.parseObject(message);
            String time = mqMessage.getString("time");
            String event = mqMessage.getString("event");
            System.out.println("time:" + time + ",event :" + event);
        }
    }
}
