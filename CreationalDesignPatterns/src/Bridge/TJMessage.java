package Bridge;

public class TJMessage extends AbstractMessage {

	public TJMessage(MessageImplementor mi) {
		super(mi);
	}
	
	
	public void send(String msg,String user){
		msg="����Ϣ�ȼ����ؼ���"+msg;
		super.send(msg, user);
	}

}
