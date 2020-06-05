package com.itheima.reflector;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/**
 *  获取Class中Methold对象
 *          Method[] getMethods()返回所有公共成员方法对象的数组，包括继承的Method[]
 *          getDeclaredMethods()返回所有成员方法对象的数组，不包括继承的Method
 *          getMethod(String name, Class<?>... parameterTypes) 返回单个公共成员方法对象
 *          Method getDeclaredMethod(String name, Class<?>... parameterTypes)返回单个成员方法对象
 */
public class GetMethold {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // 1.获取Class对象
        Class<Student> studentClass = Student.class;

        // 2.获取指定的方法
        Method declaredMethod = studentClass.getDeclaredMethod("learn");
        Method declaredMethod1 = studentClass.getDeclaredMethod("learn",String.class);
//        Method method = studentClass.getMethod("learn"); // getMethold()不能获取到私有方法,但是能获得父类的公共方法
        declaredMethod.setAccessible(true);
        declaredMethod1.setAccessible(true);

        Student student = new Student("李小鹏",22);
        declaredMethod.invoke(Student.class);

        System.out.println("-------------");
        Object invoke = declaredMethod1.invoke(Student.class, "哈哈,");
        System.out.println(invoke);
        System.out.println("-------------");
//        method.invoke(Student.class);

        // 3.方法有返回值时
        Method method = studentClass.getDeclaredMethod("work", Integer.class);
        method.setAccessible(true);
        Object invoke1 = method.invoke(student, 6);
        System.out.println(student.getName()+"一周工作:"+invoke1+"天!");


    }
}
