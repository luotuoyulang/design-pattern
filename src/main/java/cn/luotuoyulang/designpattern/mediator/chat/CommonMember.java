package cn.luotuoyulang.designpattern.mediator.chat;

/**
 * 具体同事类 CommonMember (普通会员类)
 */
public class CommonMember extends Member {

    public CommonMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.println("普通会员发送信息：");
        chatRoom.sendText(name,to,message);
    }

    @Override
    public void sendImage(String to, String image) {
        System.out.println("普通会员不能发送图片！");

    }
}
