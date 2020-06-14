package cn.luotuoyulang.designpattern.decorate;

/**
 * 具体抽象类 Robot (机器人类)
 */
public class Robot extends Changer{

    public Robot(Transform transform) {
        super(transform);
        System.out.println("变成机器人");
    }

    public void say(){
        System.out.println("说话！！！！");
    }
}
