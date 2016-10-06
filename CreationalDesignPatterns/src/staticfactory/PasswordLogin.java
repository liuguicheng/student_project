package staticfactory;

public class PasswordLogin implements Login {

	@Override
	public boolean verify(String name, String password) {
		
		System.out.println("用户名："+name+"，密码："+password+",使用口令登陆！");
		return true;
	}

}
