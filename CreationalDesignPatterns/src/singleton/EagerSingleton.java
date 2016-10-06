package singleton;

public class EagerSingleton {

	/**
	 * 饿汉单例
	 * 不管用不用，先创建，减少判断是否创建，节省运行时间
	 */
	private static EagerSingleton eagersingleton=new EagerSingleton();
	
	private EagerSingleton() {}
	
	public static EagerSingleton getInstance(){
		return eagersingleton;
	}
}
