package com.example.plugins.util.logutil.annotation;

import java.lang.annotation.*;

/**
 * @author lixn
 * @date 2022/01/11 15:24
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogFormat {
    String params() default "";
}
