package com.example.plugins.util.logutil.aop;

import com.example.plugins.util.logutil.AbstractCustomLogListener;
import com.example.plugins.util.logutil.LogFormatter;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Method;

/**
 * @author lixn
 * @date 2022/01/11 16:18
 **/
@Aspect
@Component
public class SystemLogAspect {

    @Resource
    private AbstractCustomLogListener customLogListener;

    @Resource(name = "LogFormatter")
    private LogFormatter formatter;

    @Around("@annotation(com.example.plugins.util.logutil.annotation.LogFormat)")
    public Object doAround(ProceedingJoinPoint point) throws Throwable{
        Object result;
        try {
            result = point.proceed();
            createLog(((MethodSignature)point.getSignature()).getMethod());
        } catch (Throwable throwable) {
            createLog(((MethodSignature)point.getSignature()).getMethod());
            throw throwable;
        }
        return result;
    }

    private void createLog(Method method) throws Throwable{
        if (customLogListener != null) {
            customLogListener.createLog();
        }
        formatter.registerMethod(method);
        formatter.analyse();
    }

}
