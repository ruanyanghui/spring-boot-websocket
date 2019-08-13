package com.ryh.websocket.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author ryh
 */
@EnableScheduling
@SpringBootApplication
public class DemoWebSocketServer {

    public static void main(String[] args) {
        SpringApplication.run(DemoWebSocketServer.class, args);
    }
}
