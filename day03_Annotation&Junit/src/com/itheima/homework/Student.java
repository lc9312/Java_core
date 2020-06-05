package com.itheima.homework;


public class Student{
    private String name;
    private int age;
    //公有、无参构造
    public Student(){}
    //公有、全参构造

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //公有、get/set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //普通成员方法
    public void show(){
        System.out.println("大家好，我叫：" + name + "我今年： "+ age +"岁");
    }
}
