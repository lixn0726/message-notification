package com.example.apicommon.dto;

/**
 * @author lixn
 * @date 2022/01/11 14:40
 **/
public class LogSelectDTO {

    private String functionName = "";

    private String keyword = "";

    private long startTimestamp = 0L;

    private long endTimestamp = 0L;

    public static builder builder() {
        return new builder();
    }

    public static final class builder {
        private String functionName;
        private String keyword;
        private long startTimestamp;
        private long endTimestamp;

        public builder functionName(String functionName) {
            this.functionName = functionName;
            return this;
        }

        public builder keyword(String keyword) {
            this.keyword = keyword;
            return this;
        }

        public builder startTimestamp(long startTimestamp) {
            this.startTimestamp = startTimestamp;
            return this;
        }

        public builder endTimestamp(long endTimestamp) {
            this.endTimestamp = endTimestamp;
            return this;
        }
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public long getStartTimestamp() {
        return startTimestamp;
    }

    public void setStartTimestamp(long startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    public long getEndTimestamp() {
        return endTimestamp;
    }

    public void setEndTimestamp(long endTimestamp) {
        this.endTimestamp = endTimestamp;
    }
}
