package com.example.apihandler.handler;

import com.example.apihandler.domain.ReadyToSend;
import com.example.plugins.support.pipeline.ProcessPhase;
import com.example.plugins.support.pipeline.ProcessPipeline;

import java.util.Set;

/**
 * @author lixn
 * @date 2022/01/10 17:56
 **/
public abstract class DefaultMessageHandler implements Notify {

    private ProcessPipeline pipeline;

    @Override
    public void sendMessage(ReadyToSend content, Set<Integer> ids) {
        preHandle();
        for (ProcessPhase processPhase : pipeline.getTotalPhase()) {
            processPhase.analyse();
        }
        postHandle();
    }

    protected abstract void preHandle(); // 在消息发送前进行一系列的处理

    protected abstract void postHandle(); // 在消息发送之后进行一系列的处理，比如日志的输出

}
