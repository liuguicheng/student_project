package Bridge;

public class JJMessage extends AbstractMessage {

	
	
	public JJMessage(MessageImplementor mi) {
		super(mi);
	}
	
	public void send(String msg,String user){
		msg="����Ϣ�ȼ����Ӽ���"+msg;
		super.send(msg, user);
	}

}
