package cn.luotuoyulang.designpattern.mediator;

import java.util.ArrayList;

/**
 * 抽象中介者类
 */
public abstract class Mediator {

    // 在抽象中介者可以定义一个同事类的集合，用于存储同事类对象并提供注册方法,同时声明了具体中介者类
    // 所具有的方法。在具体中介者类中将实现这些抽象方法。
    protected ArrayList colleagues;

    public void register(Colleague colleague){
        colleagues.add(colleague);
    }

    public abstract void operation();
}