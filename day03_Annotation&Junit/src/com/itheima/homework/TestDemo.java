package com.itheima.homework;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*		1). 使用反射获取Student的Class对象。
        2). 获取 “公有、全参构造方法”；
        3). 调用 “公有、全参构造方法”传入：“柳岩”,17两个参数。
        4). 反射获取show()方法
        5). 调用show()方法*/
public class TestDemo {
    @Test
    public void test() throws Exception {
        // 1.获取反射
        Class<Student> studentClass = Student.class;

        // 2.获取公有.全参构造方法
        Constructor constructor = studentClass.getConstructor(String.class,int.class);

        // 3.调用构造方法创建对象
        Student liuy = (Student) constructor.newInstance("柳岩",17);

        // 4.反射获取show方法
        Method method = studentClass.getMethod("show");

        // 5.调用show()方法
        method.invoke(liuy);
    }
}
