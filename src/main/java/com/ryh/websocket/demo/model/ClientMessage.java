package com.ryh.websocket.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;


/**
 * @author ryh
 */
@Data
@AllArgsConstructor
public class ClientMessage {

    private String name;


    public ClientMessage() {
    }

}
