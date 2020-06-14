package cn.luotuoyulang.designpattern.decorate.classic;

public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    public void operation(){
        super.operation();
        addedBeahvior();
    }

    public void addedBeahvior(){
        // 新增方法
    }
}
