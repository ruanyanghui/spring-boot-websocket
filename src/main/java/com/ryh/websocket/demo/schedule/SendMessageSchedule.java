package com.ryh.websocket.demo.schedule;

import com.ryh.websocket.demo.model.ClientMessage;
import com.ryh.websocket.demo.model.ServerMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static com.ryh.websocket.demo.consts.GlobalConsts.TOPIC;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author ryh
 *
 */
@Slf4j
@Component
public class SendMessageSchedule {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;


    @Scheduled(fixedRate = 1000 * 60 * 1)//每分钟发一次
    public void releaseClaimPoint() {
        ServerMessage msg = new ServerMessage();
        Random random = new Random();
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"德玛西亚之力 盖伦");
        map.put(2,"至高之拳 李青");
        map.put(3,"疾风剑豪 亚索");
        map.put(4,"迅捷斥候 提莫");
        map.put(5,"恐惧新星 德莱厄斯");
        map.put(6,"祖安狂人 蒙多");
        Integer[] keys = map.keySet().toArray(new Integer[0]);
        Integer randomKey = keys[random.nextInt(keys.length)];
        String randomName = map.get(randomKey);
        msg.setContent(randomName);
        log.info("往客户端发送的name是 "+randomName);
        simpMessagingTemplate.convertAndSend(TOPIC, msg);
    }
}