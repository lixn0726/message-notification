package com.example.apihandler.handler.concrete;

import com.example.apihandler.annotation.Notifier;
import com.example.apihandler.handler.DefaultMessageHandler;

/**
 * @author lixn
 * @date 2022/01/11 09:04
 **/
@Notifier
public class PhoneCallMessageHandler extends DefaultMessageHandler {

    private String content;

    private static final String CONTENT_TEMPLATE = "";

    @Override
    protected void preHandle() {

    }

    @Override
    protected void postHandle() {

    }
}
