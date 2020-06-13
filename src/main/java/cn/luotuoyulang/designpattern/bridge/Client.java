package cn.luotuoyulang.designpattern.bridge;

public class Client {

    public static void main(String[] args) {
        Color color;
        Pen pen;
        color = new RedColor();
        pen = new BigPen();
        pen.setColor(color);
        pen.draw("鲜花");
    }
}
