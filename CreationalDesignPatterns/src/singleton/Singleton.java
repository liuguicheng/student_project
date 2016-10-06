package singleton;

public class Singleton {
	/**
	 * 双重检查
	 * 使用关键字volatile(jdk1.5及以上),synchronized
	 * 运行效率不是很高
	 */
	
	private volatile static Singleton singleton=null;
	
	private Singleton() {}
	
	public static Singleton getInstance(){
		//先检查实例是否存在，如果不存在才进入下面的同步块
		if(singleton==null){
			//同步块，线程安全的创建实例
			synchronized (Singleton.class) {
				//再次检查实例是否存在，如果不存在才真正的创建实例
				if(singleton==null){
					singleton=new Singleton();
				}
			}
		}
		return singleton;
	}

}
