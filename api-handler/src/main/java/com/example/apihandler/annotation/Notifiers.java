package com.example.apihandler.annotation;

import java.lang.annotation.*;

/**
 * @author lixn
 * @date 2022/01/11 09:45
 *
 * 标注某个类，需要哪些类型的通知
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Notifiers {
    Notifier[] value();
}
