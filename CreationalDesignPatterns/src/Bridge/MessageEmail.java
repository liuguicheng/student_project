package Bridge;

public class MessageEmail implements MessageImplementor {

	@Override
	public void send(String msg, String user) {
		System.out.println("通过email发送给"+user+",消息内容是："+msg);
	}

}
