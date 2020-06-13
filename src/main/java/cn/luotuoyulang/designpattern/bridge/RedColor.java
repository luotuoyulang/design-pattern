package cn.luotuoyulang.designpattern.bridge;

/**
 * 具体实现类
 */
public class RedColor implements Color{
    @Override
    public void bepaint(String penType, String name) {
        System.err.println(penType + "红色的" + name + ".");
    }
}
