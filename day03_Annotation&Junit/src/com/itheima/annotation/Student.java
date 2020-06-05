package com.itheima.annotation;

public class Student {
    private String name;

    public void eat(){
        System.out.println("吃啊吃!");
    }
    public void drink(){
        System.out.println("喝啊喝!");
    }
    public void sleep(){
        System.out.println("睡啊睡!");
    }

    @Book(name = "五年高考,三年模拟",authors = {"衡水一中"},value = "123")
    public void learnEn(){
        System.out.println("学英语..");
    }

    @Book(name = "五年高考,三年模拟",authors = {"衡水一中"},value = "123")
    public void learnCn(){
        System.out.println("学语文..");
    }

    @Book(name = "五年高考,三年模拟",authors = {"衡水一中"},value = "123")
    public void learnMath(){
        System.out.println("学高数..");
    }
}
