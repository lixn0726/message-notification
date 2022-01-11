package com.example.apicommon.domain;


import java.util.Map;

/**
 * @author lixn
 * @date 2022/01/11 15:34
 **/
public class LogRecord {
    private String methodName;
    private Map<String, String> paramMap;
    private String returnValue;
    private long timestamp;

    public static builder builder() {
        return new builder();
    }

    public static final class builder {
        private String methodName;
        private Map<String, String> paramMap;
        private String returnValue;
        private long timestamp;

        public builder params(Map<String, String> paramMap) {
            this.paramMap = paramMap;
            return this;
        }

        public builder returnValue(String returnValue) {
            this.returnValue = returnValue;
            return this;
        }

        public builder timestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public builder methodName(String methodName) {
            this.methodName = methodName;
            return this;
        }

        public LogRecord build() {
            LogRecord logRecord = new LogRecord();
            logRecord.setMethodName(methodName);
            logRecord.setParamMap(paramMap);
            logRecord.setReturnValue(returnValue);
            logRecord.setTimestamp(timestamp);
            return logRecord;
        }
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Map<String, String> getParamMap() {
        return paramMap;
    }

    public void setParamMap(Map<String, String> paramMap) {
        this.paramMap = paramMap;
    }

    public String getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(String returnValue) {
        this.returnValue = returnValue;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
