package staticfactory;

public class PasswordLogin implements Login {

	@Override
	public boolean verify(String name, String password) {
		
		System.out.println("�û�����"+name+"�����룺"+password+",ʹ�ÿ����½��");
		return true;
	}

}
