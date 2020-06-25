package cn.luotuoyulang.designpattern.mediator.chat;

/**
 * 抽象中介者
 */
public abstract class AbstractChatRoom {

    /**
     * 定义注册同事类
     * @param member
     */
    public abstract void register(Member member);

    /**
     * 同事之间发送文本信息
     * @param from
     * @param to
     * @param message
     */
    public abstract void sendText(String from,String to,String message);

    /**
     * 发送图片信息
     * @param from
     * @param to
     * @param image
     */
    public abstract void sendImage(String from,String to,String image);
}
