package singleton;

public class LazySingleton {

	/**
	 * ��������
	 * ʹ��ͬ����
	 * ÿ�ζ��ж��Ƿ񴴽����õ��Ŵ���
	 */
	
	private static LazySingleton lazysingleton=null;
	
	private LazySingleton() {}
	
	
	public static synchronized LazySingleton getInstance(){
		if(lazysingleton==null){
			lazysingleton=new LazySingleton();
		}
		return lazysingleton;
	}
}
