package cn.luotuoyulang.designpattern.bridge;

/**
 * 绿色颜色类
 */
public class GreenColor implements Color {
    @Override
    public void bepaint(String penType, String name) {
        System.err.println(penType + "绿色的" + name + ".");
    }
}
