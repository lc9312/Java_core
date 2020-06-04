package com.itheima.reflector;

/**
 * 获取Class类对象的三者方式
 *      1.Class 类的静态方法Byname(类的全限定名)
 *      2.类的字节码文件(即类名.class)
 *      3.类对象的getClass()方法
 *      注意:这三种方式获取的是同一个Class对象
 */
public class GetClass {
    public static void main(String[] args) throws ClassNotFoundException {
        // 1.通过Class静态方法获取
        Class clazz1 = Class.forName("com.itheima.reflector.Student");

        // 2.通过字节码文件获取
        Class clazz2 = Student.class;

        // 3.通过类的实例对象获取
        Student stu = new Student();
        Class clazz3 = stu.getClass();
        System.out.println(clazz1);
        System.out.println(clazz2);
        System.out.println(clazz3);
        System.out.println(clazz1 == clazz2);
        System.out.println(clazz2 == clazz3);
    }
}
