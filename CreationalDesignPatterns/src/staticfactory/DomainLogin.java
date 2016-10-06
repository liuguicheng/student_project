package staticfactory;

public class DomainLogin implements Login {

	@Override
	public boolean verify(String name, String password) {
		System.out.println("用户名："+name+"，密码："+password+",使用域登陆！");
		return true;
	}

}
