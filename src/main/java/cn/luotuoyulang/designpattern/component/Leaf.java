package cn.luotuoyulang.designpattern.component;

/**
 * 叶子构件
 * 注意：叶子构件不能再包含再抽象构件类中声明的所有方法，因此客户端代码中调用也子构件的子构件管理
 * 和访问方法时需要提供异常处理或者错误提示
 */
public class Leaf extends Component {
    @Override
    public void add(Component c) {
        // 异常处理或错误提示
    }

    @Override
    public void remove(Component c) {
        // 异常处理或错误提示
    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        // 代码实现
    }
}
