package cn.luotuoyulang.designpattern.commond;

public class Invoker {
    private Command command;
    public Invoker(Command command){
        this.command = command;
    }
    public void setCommand(Command command){
        this.command = command;
    }
    // 业务方法,用于调用命令类得方法
    public void call(){
        command.execute();
    }
}
