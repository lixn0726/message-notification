package com.example.apihandler.handler;

import java.util.Set;

/**
 * @author lixn
 * @date 2022/01/10 17:55
 **/
public interface Notify {
    void sendMessage(String content, Set<Integer> ids);
}
