package com.itheima.multi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author
 * @date 2020/4/6 18:28
 * @desc  多列模式： 控制实例化的数量 new
 *          * 1.不能够直接new  --构造方法必须私有化（private）
 *           * 2. 给别人的时候规定一个数量，没有了就获取不到了
 */
public class Multition {

    // 1.构造方法私有化--不能new
    private Multition() {

    }
    // 2.控制实例数量  final一般用来修饰不可变的对象
    private static  final int  maxCount = 3 ;

    // 3.修建一个池子，把实例化的对象放进去，后面的人需要的时候都从这里面拿
    //   3.1 :池子：map和set排除
    //    3.2 ：list （linkedList--链表 更新容易，获取很慢   ArrayList--数组  更新慢，获取快）
    private  static List<Multition> list = new ArrayList<>();

    // 4.往池子里面塞东西，前提是不管创建多少次，这个逻辑一定并且只执行一次
    static {
        for (int i = 0; i < maxCount; i++) {
            Multition multition = new Multition();
            list.add(multition);
        }
    }

    // 5.为别人提供对象
    public static Multition getMultition(){
        Random random = new Random();
        int index = random.nextInt(maxCount);
        return  list.get(index);
    }
}
