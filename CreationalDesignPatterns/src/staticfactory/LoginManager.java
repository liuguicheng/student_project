package staticfactory;

public class LoginManager {

	
	public static Login factory(String type){
		
		if(type.equals("password")){
			return new PasswordLogin();
		}else if(type.equals("domain")){
			return new DomainLogin();
		}else{
			throw new RuntimeException("��½���Ͳ��Ϸ�");
		}
	}
}