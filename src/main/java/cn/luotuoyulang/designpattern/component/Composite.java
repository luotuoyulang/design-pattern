package cn.luotuoyulang.designpattern.component;

import java.util.ArrayList;

/**
 * 容器构件
 */
public class Composite extends Component {

    private ArrayList<Component> list = new ArrayList<Component>();

    @Override
    public void add(Component c) {
        list.add(c);
    }

    @Override
    public void remove(Component c) {
        list.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return list.get(i);
    }

    @Override
    public void operation() {
        for (Component component : list) {
            component.operation();
        }
    }
}
