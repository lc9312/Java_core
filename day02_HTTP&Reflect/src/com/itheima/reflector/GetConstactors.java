package com.itheima.reflector;

import java.lang.reflect.Constructor;

/**
 * Class类获取构造方法对象,四种
 *         Constructor<?>[] getConstructors() 返回所有公共构造方法对象的数组
 *         Constructor<?>[] getDeclaredConstructors() 返回所有构造方法对象的数组,包括私有
 *         Constructor<T> getConstructor(Class<?>... parameterTypes) 返回单个公共构造方法对象
 *         Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes) 返回单个构造方法对象,可以是私有构造方法
 */
public class GetConstactors {
    public static void main(String[] args) throws NoSuchMethodException {
//        methold1();
//        methold2();
//        methold3();
        // 4.获取单个构造方法,可以获取私有的
        Class clazz = Student.class;
        Constructor constructor = clazz.getDeclaredConstructor(String.class);
        System.out.println(constructor);
    }

    public static void methold3() throws NoSuchMethodException {
        // 3.获取单个公共的构造方法
        Class clazz = Student.class;
        Constructor constructor = clazz.getConstructor();
        System.out.println(constructor);
/*        Constructor constructor1 = clazz.getConstructor(String.class);
        System.out.println(constructor1);*/
        Constructor constructor2 = clazz.getConstructor(Integer.class);
        System.out.println(constructor2);
    }

    public static void methold2() {
        // 2.获取所有构造方法
        Class clazz = Student.class;
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
    }

    public static void methold1() {
        // 1.获取所有公共构造方法
        Class clazz = Student.class;
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
    }
}
