package cn.luotuoyulang.designpattern.commond;

/**
 * television 是请求得接收者，它实现了具体的业务操作，
 * 如 open() , close() 和 changeChannel() 方法
 */
public class Television {
    public void open(){
        System.out.println("打开电视机。。。。");
    }
    public void close(){
        System.out.println("关闭电视机。。。。");
    }
    public void changeChannel(){
        System.out.println("切换电视机频道");
    }
}
