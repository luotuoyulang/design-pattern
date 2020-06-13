package cn.luotuoyulang.designpattern.bridge;

/**
 * 扩充抽象类
 */
public class BigPen extends Pen{
    @Override
    public void draw(String name) {
        String penType = "大号毛笔绘制";
        this.color.bepaint(penType,name);
    }
}
