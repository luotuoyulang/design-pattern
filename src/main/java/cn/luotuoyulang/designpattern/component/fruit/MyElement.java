package cn.luotuoyulang.designpattern.component.fruit;

/**
 * 抽象构件类
 * 在 MyElement 中没有声明子构件操作相关方法,在此处使用的是安全组合模式,
 * 而不是透明组合模式
 */
public abstract class MyElement {
    public abstract void eat();
}
