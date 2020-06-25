package cn.luotuoyulang.designpattern.mediator;

/**
 * 在具体同事类ConcreteColleague中实现了在抽象同事类中声明的方法，其中方法method1()是同事
 * 类的自身方法(Seft-Method),用于处理自己的行为,而方法method2()是依赖方法(Depend-Method),
 * 用于调用在中介者中定义的方法,依赖中介者来完成
 */
public class ConcreteColleague extends Colleague {

    public ConcreteColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}
