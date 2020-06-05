package com.itheima.homework;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 使用main方法来模拟Junit的@Test的功能
 */
public class TestDemo02 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        // 1.获取Class对象
        Class<Drive> driveClass = Drive.class;

        // 2.反射获取所有方法
        Method[] methods = driveClass.getMethods();

        // 3.创建对象
        Drive xiaom = new Drive();

        // 4.运行含有@Run注解的方法
        for (Method method : methods) {
            if(method != null && method.isAnnotationPresent(Run.class)){
                method.invoke(xiaom);
            }
        }
    }

}
