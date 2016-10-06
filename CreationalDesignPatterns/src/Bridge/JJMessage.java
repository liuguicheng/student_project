package Bridge;

public class JJMessage extends AbstractMessage {

	
	
	public JJMessage(MessageImplementor mi) {
		super(mi);
	}
	
	public void send(String msg,String user){
		msg="【消息等级：加急】"+msg;
		super.send(msg, user);
	}

}
