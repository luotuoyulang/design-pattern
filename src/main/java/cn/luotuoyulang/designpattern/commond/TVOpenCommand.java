package cn.luotuoyulang.designpattern.commond;

/**
 * 具体命令类 TVOpenCommand(电视机打开命令类)
 * TVOpenCommand 类实现了抽象命令类接口，在 AbstractCommand,并实现了
 * 在 AbstractCommand 中声明得方法execute(),在TVOpenCommand中定义了
 * Television类
 */
public class TVOpenCommand implements AbstractCommand {

    private Television tv;

    public TVOpenCommand() {
        this.tv = new Television();
    }

    @Override
    public void execute() {
        tv.open();
    }
}
