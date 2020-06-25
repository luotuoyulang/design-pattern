package cn.luotuoyulang.designpattern.mediator;

/**
 * 在抽象同事类中维持了一个抽象中介者的引用,用于调用中介者的方法，典型的抽象同事类的代码如下
 * 在抽象同事类中声明了同事类的抽象方法，而在具体同事类中将实现这些方法
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

    public abstract void method1();

    public abstract void method2();
}
