package com.itheima.reflector;

public class Student {
    // 成员属性:姓名和年龄
    private String name;
    private Integer age;

    // 无参构造
    public Student(){
        System.out.println("无参构造!");
    }

    // 全参构造
    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("全参构造!");
    }

    // 私有构造
    private Student(String name){
        this.name = name;
        System.out.println("私有含参(name)构造!");
    }


    // 共有含参构造
    public Student(Integer age){
        System.out.println("公有含参构造");
    }

    // getter 和 setter 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    // toString 方法
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // learn方法
    public void learn(){
        System.out.println("好好学习,天天向上!");
    }
}
