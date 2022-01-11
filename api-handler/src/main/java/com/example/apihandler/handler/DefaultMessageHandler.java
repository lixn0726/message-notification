package com.example.apihandler.handler;

import com.example.plugins.support.pipeline.ProcessPipeline;

import java.util.Set;

/**
 * @author lixn
 * @date 2022/01/10 17:56
 **/
public abstract class DefaultMessageHandler implements Notify {

    private ProcessPipeline pipeline;

    @Override
    public void sendMessage(String content, Set<Integer> ids) {
        preHandle();
        // todo doSomething()...
        postHandle();
    }

    protected abstract void preHandle();

    protected abstract void postHandle();

}
