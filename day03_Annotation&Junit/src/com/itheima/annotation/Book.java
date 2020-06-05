package com.itheima.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Book {
    //写属性
    int price() default 100; //价格
    String name(); //default "三国演义";//书名
    String[] authors();//default {"罗贯中"};//作者
    String value();
}

