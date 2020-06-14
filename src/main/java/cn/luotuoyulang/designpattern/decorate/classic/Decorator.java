package cn.luotuoyulang.designpattern.decorate.classic;


/**
 * 抽象装饰类
 */
public class Decorator extends Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
