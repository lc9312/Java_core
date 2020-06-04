package com.itheima.single;

/**
 * 懒汉式单例
 *      1.构造方法私有化
 *      2.有需求才创建对象
 *      3.保证线程安全
 */
public class LazySingleton {
    private static LazySingleton lazySingleton ;
    private LazySingleton(){}
    private static Object obj;

    public static LazySingleton getLazySingleton(){
        synchronized (obj) {
            if (lazySingleton != null) {
                lazySingleton = new LazySingleton();
            }
            return lazySingleton;
        }
    }
}
