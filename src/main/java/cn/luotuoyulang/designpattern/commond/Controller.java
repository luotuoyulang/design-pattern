package cn.luotuoyulang.designpattern.commond;

/**
 * 调用类Controller(控制器类) Controller 类是调用者，即请求的发送者，它与抽象命令类
 * AbstractCommand 相关联，在程序运行时再注入具体命令类对象，在Controller类的业务方法中
 * 将调用命令类的execute()方法，而不同的命令子类提供了不同的execute()方法的实现，可以调用请求
 * 接收者的不同请求响应方法。只需要更换具体的命令类对象即可使用相同的Controller对象作用于不同的
 * 请求接收者，实现请求调用者和接收者的解耦
 */
public class Controller {
    private AbstractCommand openCommand,closeCommand,changeCommand;

    public Controller(AbstractCommand openCommand, AbstractCommand closeCommand, AbstractCommand changeCommand) {
        this.openCommand = openCommand;
        this.closeCommand = closeCommand;
        this.changeCommand = changeCommand;
    }

    public void open(){
        openCommand.execute();
    }

    public void change(){
        changeCommand.execute();
    }

    public void close(){
        closeCommand.execute();
    }
}
