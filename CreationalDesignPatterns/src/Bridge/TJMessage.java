package Bridge;

public class TJMessage extends AbstractMessage {

	public TJMessage(MessageImplementor mi) {
		super(mi);
	}
	
	
	public void send(String msg,String user){
		msg="【消息等级：特级】"+msg;
		super.send(msg, user);
	}

}
