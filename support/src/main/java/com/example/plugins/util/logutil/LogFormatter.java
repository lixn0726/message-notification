package com.example.plugins.util.logutil;

import com.example.apicommon.domain.LogRecord;
import com.example.plugins.util.logutil.annotation.LogFormat;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.*;

/**
 * @author lixn
 * @date 2022/01/11 15:24
 *
 * 系统自带的日志格式化器（默认的）
 **/
@Component(value = "LogFormatter")
@Slf4j
public class LogFormatter {

    private Method method;

    public void registerMethod(Method method) throws Exception{
        if (method.isAnnotationPresent(LogFormat.class)) {
            this.method = method;
        } else {
            method = null;
            throw new Exception("this method cannot be analyse, because it's not presented by the Annotation { LogFormat.class }");
        }
    }

    public void analyse() throws Exception{
        if (method == null) {
            throw new Exception("method is null, cannot analyse");
        }

        String methodName = method.getName();
        Parameter[] params = method.getParameters();
        Map<String, String> paramMap = new HashMap<>(16);
        for (Parameter parameter : params) {
            String paramName = parameter.getName();
            String paramType = parameter.getType().getSimpleName();
            paramMap.put(paramType, paramName);
        }
        long timestamp = System.currentTimeMillis() / 1000;
        String returnValue = method.getReturnType().getSimpleName();

        LogRecord logRecord = LogRecord.builder()
                .methodName(methodName)
                .params(paramMap)
                .returnValue(returnValue)
                .timestamp(timestamp)
                .build();

        log.info("System api is requested, request info as [{}]", logRecord);
    }

}
