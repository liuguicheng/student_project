package singleton;

public class LazySingleton {

	/**
	 * 懒汉单例
	 * 使用同步锁
	 * 每次都判断是否创建，用到才创建
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
