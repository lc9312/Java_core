package com.itheima.reflector;
import java.lang.reflect.Field;

/**
 *  Class类中,获取Field对象
 *          Field[] getFields() 返回所有公共成员变量对象的数组Field[]
 *          getDeclaredFields() 返回所有成员变量对象的数组
 *          Field getField(String name) 返回单个公共成员变量对象
 *          Field getDeclaredField(String name) 返回单个成员变量对象
 *  注:仅以 Field getDeclaredField(String name) 演示
 *  利用Field对象给类的对象属性赋值,及取出对应的属性值,以私有属性演示
 *          field.set(类的是咧对象,属性值)
 *          field.set(类的实例对象)
 */
public class GetField {
    public static void main(String[] args) throws Exception {
        // 1.利用反射获取Class对象
        Class clazz = Class.forName("com.itheima.reflector.Student");

        // 2.获取对应属性的Field对象
        Field  field = clazz.getDeclaredField("name");

        // 3.暴力反射,设置Field为无障碍访问
        field.setAccessible(true);

        // 4.新建对象,给属性赋值,并取得属性值
//        Student student = (Student) clazz.getDeclaredConstructor(String.class,Integer.class).newInstance("jacklove",18);
        Student student = new Student("jacklove",18);
        field.set(student,"uzi");

        field.set(Student.class,"水晶哥");
        System.out.println("世界第一ADC:"+field.get(student));
    }
}
