package com.itheima.annotation;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception {
        // 1.获取Class对象
        Class clazz = Class.forName("com.itheima.annotation.Student");

        // 2.获取所有方法,创建对象用于调用方法
        Method[] methods = clazz.getMethods();
        Student student = new Student();

        // 3.对含有Book注解的方法全部运行
        for (Method method : methods) {
            if(method.isAnnotationPresent(Book.class)){
                method.invoke(student);
            }
        }
    }
}
