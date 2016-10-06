package Bridge;

public class MessageSMS implements MessageImplementor {

	@Override
	public void send(String msg, String user) {
		System.out.println("通过sms发送给"+user+",消息内容是："+msg);
	}

}
