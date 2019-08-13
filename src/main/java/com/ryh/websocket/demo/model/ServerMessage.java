package com.ryh.websocket.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ryh
 */
@Data
@AllArgsConstructor
public class ServerMessage {

    private String content;

    public ServerMessage() {
    }

    @Override
    public String toString() {
        return content;
    }

}
