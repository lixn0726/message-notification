package com.example.apicommon.annotation;

import java.lang.annotation.*;

/**
 * @author lixn
 * @date 2022/01/11 09:51
 *
 * 标识一个Handler，只起到标识的作用
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Notifiers.class)
@Documented
public @interface Notifier {
    Class<?> handler() ;
}
