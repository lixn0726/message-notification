package com.example.plugins.support.pipeline;

import java.util.Set;

/**
 * @author lixn
 * @date 2022/01/11 10:22
 **/
public class ProcessPipeline {

    private Set<ProcessPhase> totalPhase;

    public void execute() {
        for (ProcessPhase phase : totalPhase) {
            phase.doSomething();
        }
    }

    public Set<ProcessPhase> getTotalPhase() {
        return totalPhase;
    }

    public void setTotalPhase(Set<ProcessPhase> totalPhase) {
        this.totalPhase = totalPhase;
    }

    public void addPhase(ProcessPhase phase) {
        this.totalPhase.add(phase);
    }
}
