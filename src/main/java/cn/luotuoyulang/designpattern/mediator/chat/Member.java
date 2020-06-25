package cn.luotuoyulang.designpattern.mediator.chat;

import lombok.Data;

/**
 * 抽象同事类 Memeber(会员类)
 * 由于不同类型的会员发送文本信息和图片信息的方式有所区别,
 * 因此在Member类中还
 */
@Data
public abstract class Member {

    /**
     * 抽象聊天类的引用
     */
    protected AbstractChatRoom chatRoom;

    protected String name;

    public Member(String name) {
        this.name = name;
    }

    public abstract void sendText(String to,String message);

    public abstract void sendImage(String to,String image);

    public void receiveText(String from,String message) {
        System.out.println(from + "发送文本给" + this.name + "内容为：" + message);
    }

    public void receiveImage(String from,String image) {
        System.out.println(from + "发送图片给" + this.name + "内容为：" + image);
    }
}
