package com.itheima.single;

/**
 * 饿汉式单例模式
 * 重点:
 *      1.构造方法私有化
 *      2.新建对象赋值给私有静态成员变量
 *      3.提供公有方法,得到私有对象
 */
public class HungrySingleton {
    // 私有静态成员变量保存类对象
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    // 构造方法私有化
    private HungrySingleton(){}

    // 提供静态方法获取单例对象
    public static final HungrySingleton getHungrySingleton(){
        return hungrySingleton;
    }
}
