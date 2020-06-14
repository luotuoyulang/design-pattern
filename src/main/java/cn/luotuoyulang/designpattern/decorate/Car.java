package cn.luotuoyulang.designpattern.decorate;

/**
 * 构建类 Car(汽车类)
 */
public final class Car implements Transform{

    public Car(){
        System.out.println("变形金刚是一辆车。。。");
    }

    @Override
    public void move() {
        System.out.println("在陆地上移动。。。");
    }
}
