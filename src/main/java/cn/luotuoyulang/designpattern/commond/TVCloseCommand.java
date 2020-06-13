package cn.luotuoyulang.designpattern.commond;

/**
 * 具体命令类 TVCloseCommand (电视机关闭命令类)
 * TVCloseCommand 类也实现了抽象命令接口 AbstractCommand，实现了在
 * AbstractCommand中声明得方法 execute(),在TVCloseCommand得execute()
 * 方法中调用了Television类的close()方法。
 */
public class TVCloseCommand implements AbstractCommand {

    private Television tv;

    public TVCloseCommand() {
        this.tv = new Television();
    }

    @Override
    public void execute() {
        tv.close();
    }
}
