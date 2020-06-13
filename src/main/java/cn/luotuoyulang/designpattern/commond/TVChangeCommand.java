package cn.luotuoyulang.designpattern.commond;

/**
 * 具体命令类 TVChangeCommand (电视机频道切换命令类)
 * TVChangeCommand 类也实现了抽象命令类接口 AbstractCommand，
 * 实现了在 AbstractCommand 中声明得方法 execute(),在 TVChangeCommand
 * 的execute()方法中调用了Television类的changeChannel()方法。
 */
public class TVChangeCommand implements AbstractCommand {

    private Television tv;

    public TVChangeCommand() {
        this.tv = new Television();
    }

    @Override
    public void execute() {
        tv.changeChannel();
    }
}
