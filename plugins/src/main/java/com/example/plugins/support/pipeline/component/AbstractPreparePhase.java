package com.example.plugins.support.pipeline.component;

import com.example.plugins.support.pipeline.PrepareProcessPhase;

/**
 * @author lixn
 * @date 2022/01/11 10:21
 *
 * 写成抽象类是为了方便后续的自定义
 **/
public abstract class AbstractPreparePhase implements PrepareProcessPhase {

    @Override
    public void analyse() {

    }
}
