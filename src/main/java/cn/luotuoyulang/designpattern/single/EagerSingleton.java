package cn.luotuoyulang.designpattern.single;

/**
 * 饿汉单例模式
 */
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance(){
        return instance;
    }
}
