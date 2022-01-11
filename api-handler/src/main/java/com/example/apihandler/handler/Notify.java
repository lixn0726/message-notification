package com.example.apihandler.handler;

import com.example.apihandler.domain.ReadyToSend;

import java.util.Set;

/**
 * @author lixn
 * @date 2022/01/10 17:55
 **/
public interface Notify {
    void sendMessage(ReadyToSend content, Set<Integer> ids);
}
