package Bridge;

public abstract class AbstractMessage {
	MessageImplementor mi=null;
	
	public AbstractMessage(MessageImplementor mi) {
		this.mi=mi;
	}
	
	public void send(String msg,String user){
		this.mi.send(msg, user);
	}
}
