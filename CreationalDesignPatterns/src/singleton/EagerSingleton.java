package singleton;

public class EagerSingleton {

	/**
	 * ��������
	 * �����ò��ã��ȴ����������ж��Ƿ񴴽�����ʡ����ʱ��
	 */
	private static EagerSingleton eagersingleton=new EagerSingleton();
	
	private EagerSingleton() {}
	
	public static EagerSingleton getInstance(){
		return eagersingleton;
	}
}
