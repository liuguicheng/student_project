package singleton;

public class LazySingletonHolder {

	/**
	 * ��Lazy initialization holder classģʽ
	 * ���ģʽ�ۺ�ʹ����Java���༶�ڲ���Ͷ��߳�ȱʡͬ������֪ʶ���������ͬʱʵ�����ӳټ��غ��̰߳�ȫ
	 * ����getInstance������һ�α����õ�ʱ������һ�ζ�ȡSingletonHolder.instance��
	 * ����SingletonHolder��õ���ʼ�������������װ�ز�����ʼ����ʱ�򣬻��ʼ�����ľ�̬��
	 * �Ӷ�����Singleton��ʵ���������Ǿ�̬�������ֻ���������װ�����ʱ���ʼ��һ�Σ�
	 * �������������֤�����̰߳�ȫ�ԡ�
	 * ���ģʽ���������ڣ�getInstance������û�б�ͬ��������ֻ��ִ��һ����ķ��ʣ�����ӳٳ�ʼ����û�������κη��ʳɱ���
	 */
	private LazySingletonHolder() {}
	
	 /**
     *    �༶���ڲ��࣬Ҳ���Ǿ�̬�ĳ�Աʽ�ڲ��࣬���ڲ����ʵ�����ⲿ���ʵ��
     *    û�а󶨹�ϵ������ֻ�б����õ�ʱ�Ż�װ�أ��Ӷ�ʵ�����ӳټ��ء�
     */
	private static class SingletonHolder{
		/**
         * ��̬��ʼ��������JVM����֤�̰߳�ȫ
         */
		private static LazySingletonHolder lazysingletonholder=new LazySingletonHolder();
	}
	
	public static LazySingletonHolder getInstance(){
		return SingletonHolder.lazysingletonholder;
	}
}
