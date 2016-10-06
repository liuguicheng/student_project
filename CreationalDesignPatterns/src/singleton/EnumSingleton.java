package singleton;

public enum EnumSingleton {
	/**
	 * 用枚举实现单例
	 * 使用方法
	 * EnumSingleton.INSTANCE.singletionOpertion()
	 * 效果最好，使用范围广
	 */
	
	INSTANCE;
	
	private EnumSingleton(){}
	
	public void singletonOpertion(){
		//功能处理
	}
	

}
