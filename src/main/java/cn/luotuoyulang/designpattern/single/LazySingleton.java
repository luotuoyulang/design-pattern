package cn.luotuoyulang.designpattern.single;

import java.math.BigDecimal;

/**
 * 懒汉单例模式
 */
public class LazySingleton {

    // 静态私有成员变量
    private static LazySingleton singleton = null;

    // 私有化构造方法
    private LazySingleton() {
    }

    // 静态公有工厂方法，返回唯一实例
    public synchronized static LazySingleton getInstance(){
        if(singleton == null){
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
