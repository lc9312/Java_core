package com.itheima.reflector;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 利用Class 获取的构造器,创建实例对象,仅以私有构造演示
 */
public class GetConstactorAndNewInstance {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 1.获取Class对象
        Class clazz = Student.class;

        // 2.获取私有构造方法对象
        Constructor constructor = clazz.getDeclaredConstructor(String.class);
        Constructor constructor1 = clazz.getDeclaredConstructor();

        // 3.设定构造对象为可到达的,无障碍的
        constructor.setAccessible(true);// 称为暴力反射!

        // 4.新建对象实例
        Student student = (Student) constructor.newInstance("大漂亮");
        Student student1 = (Student) constructor1.newInstance();
        System.out.println(student.toString());
        System.out.println(student1.toString());
    }
}
