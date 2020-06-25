package cn.luotuoyulang.designpattern.mediator.chat;

import java.util.Hashtable;

/**
 * 具体中介者类ChatGroup(具体聊天室类)
 * 中介者类是中介者模式的核心，他对整个系统进行控制和协调，简化了对象之间
 * 的交互，还可以对对象之间的交互进行进一步的控制。
 */
public class ChatGroup extends AbstractChatRoom {

    private Hashtable members = new Hashtable();

    public void register(Member member) {
        if (!members.contains(member)) {
            members.put(member.getName(),member);
            member.setChatRoom(this);
        }
    }

    @Override
    public void sendText(String from, String to, String message) {
        Member member = (Member)members.get(to);
        String newMessage = message;
        // 模拟不雅字符过滤
        newMessage = message.replaceAll("日","*");
        member.receiveText(from,newMessage);
    }

    @Override
    public void sendImage(String from, String to, String image) {
        Member member = (Member) members.get(to);
        //模拟图片大小判断
        if (image.length() > 5) {
            System.out.println("图片太大，发送失败！！！");
        } else {
            member.receiveImage(from,image);
        }
    }


}
