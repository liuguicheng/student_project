package staticfactory;

public class DomainLogin implements Login {

	@Override
	public boolean verify(String name, String password) {
		System.out.println("�û�����"+name+"�����룺"+password+",ʹ�����½��");
		return true;
	}

}
