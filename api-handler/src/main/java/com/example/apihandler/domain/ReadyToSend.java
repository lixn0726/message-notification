package com.example.apihandler.domain;

import com.example.apicommon.domain.MessageContent;

/**
 * @author lixn
 * @date 2022/01/11 11:51
 **/
public class ReadyToSend<T extends MessageContent> {

    private T content;

    public ReadyToSend(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
