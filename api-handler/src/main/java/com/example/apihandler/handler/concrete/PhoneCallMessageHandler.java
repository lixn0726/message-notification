package com.example.apihandler.handler.concrete;

import com.example.apicommon.domain.MessageContent;
import com.example.apicommon.annotation.Notifier;
import com.example.apihandler.domain.ReadyToSend;
import com.example.apihandler.handler.DefaultMessageHandler;

/**
 * @author lixn
 * @date 2022/01/11 09:04
 **/
public class PhoneCallMessageHandler<T extends MessageContent> extends DefaultMessageHandler {

    private ReadyToSend<T> content;

    private static final String CONTENT_TEMPLATE = "";

    public void setContent(ReadyToSend<T> content) {
        this.content = content;
    }

    @Override
    protected void preHandle() {
        // todo 对消息进行规则过滤、内容拼接等操作
        StringBuilder sb = new StringBuilder();
        sb.append(content.getContent())
                .append(" --- is sent by PhoneCallHandler");
    }

    @Override
    protected void postHandle() {
        // todo 如果带注解就输出日志，考虑一下入参
    }
}
