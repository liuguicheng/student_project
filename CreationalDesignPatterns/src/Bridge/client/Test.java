package Bridge.client;

import Bridge.AbstractMessage;
import Bridge.JJMessage;
import Bridge.MessageEmail;
import Bridge.MessageImplementor;
import Bridge.MessageSMS;
import Bridge.TJMessage;

public class Test {

	public static void main(String[] args) {
		//桥梁模式
		/**
		 * 桥梁模式的优点
　　			●　　分离抽象和实现部分
　　				桥梁模式分离了抽象部分和实现部分，从而极大地提供了系统的灵活性。让抽象部分和实现部分独立出来，
				分别定义接口，这有助于对系统进行分层，从而产生更好的结构化的系统。
　　			●　　更好的扩展性
　　				桥梁模式使得抽象部分和实现部分可以分别独立地扩展，而不会相互影响，从而大大提高了系统的可扩展性。
		 */
		MessageImplementor mi=new MessageSMS();
		AbstractMessage am=new JJMessage(mi);
		am.send("加急速批", "张三");
		
		mi=new MessageEmail();
		am=new TJMessage(mi);
		am.send("这是内容", "张三");

	}

}
