package singleton;

public class Singleton {
	/**
	 * ˫�ؼ��
	 * ʹ�ùؼ���volatile(jdk1.5������),synchronized
	 * ����Ч�ʲ��Ǻܸ�
	 */
	
	private volatile static Singleton singleton=null;
	
	private Singleton() {}
	
	public static Singleton getInstance(){
		//�ȼ��ʵ���Ƿ���ڣ���������ڲŽ��������ͬ����
		if(singleton==null){
			//ͬ���飬�̰߳�ȫ�Ĵ���ʵ��
			synchronized (Singleton.class) {
				//�ٴμ��ʵ���Ƿ���ڣ���������ڲ������Ĵ���ʵ��
				if(singleton==null){
					singleton=new Singleton();
				}
			}
		}
		return singleton;
	}

}
