package Bridge;

public class MessageEmail implements MessageImplementor {

	@Override
	public void send(String msg, String user) {
		System.out.println("ͨ��email���͸�"+user+",��Ϣ�����ǣ�"+msg);
	}

}
