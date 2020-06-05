package com.itheima.junit;


import org.junit.Test;

public class TestJunit {

    public void eat(){
        System.out.println("吃啊吃!");
    }
    public void drink(){
        System.out.println("喝啊喝!");
    }
    public void sleep(){
        System.out.println("睡啊睡!");
    }

    @Test
    public void learnEn(){
        System.out.println("学英语..");
    }

    @Test
    public void learnCn(){
        System.out.println("学语文..");
    }

    @Test
    public void learnMath(){
        System.out.println("学高数..");
    }
}
