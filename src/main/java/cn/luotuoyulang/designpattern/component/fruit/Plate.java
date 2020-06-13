package cn.luotuoyulang.designpattern.component.fruit;

import java.util.ArrayList;

/**
 * 容器构件类 (水果盘类)
 * 1、定义了一个抽象构件类型的集合,此处使用ArrayList来实现
 * 2、它提供了用于操作子构件的相关方法,如增加子构件,删除子构件和获取子构件等方法。
 * 3、他实现了在抽象构件中定义的eat()方法，且在该方法的内部递归调用其子构件的eat方法。
 */
public class Plate extends MyElement{

    private ArrayList<MyElement> list = new ArrayList<MyElement>();

    public void add(MyElement element) {
        list.add(element);
    }

    public void remove(MyElement element) {
        list.remove(element);
    }

    @Override
    public void eat() {
        for (MyElement myElement : list) {
            myElement.eat();
        }
    }
}
