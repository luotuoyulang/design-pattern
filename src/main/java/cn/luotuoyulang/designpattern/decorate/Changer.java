package cn.luotuoyulang.designpattern.decorate;

/**
 * 抽象装饰类Changer(变化类)
 * 他是所有具体装饰类得父类，同时他也是抽象构件得子类。Changer类是装饰模式的核心
 * 他定义了一个抽象构建类型得对象 transform ,且实现了 remove 方法。
 * 客户端来说具体构件是透明的，而具体装饰着是不透明的,者称为半透明装饰模式
 */
public class Changer implements Transform {

    private Transform transform;

    public Changer(Transform transform) {
        this.transform = transform;
    }

    @Override
    public void move() {
        transform.move();
    }
}
