package cn.luotuoyulang.designpattern.component.fruit;

/**
 * 叶子构件类 Apple (苹果类)
 */
public class Apple extends MyElement{

    @Override
    public void eat() {
        System.out.println("吃苹果");
    }
}
