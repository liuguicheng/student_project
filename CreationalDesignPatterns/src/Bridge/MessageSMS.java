package Bridge;

public class MessageSMS implements MessageImplementor {

	@Override
	public void send(String msg, String user) {
		System.out.println("ͨ��sms���͸�"+user+",��Ϣ�����ǣ�"+msg);
	}

}
