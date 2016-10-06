package staticfactory;

public class TestLogin {

	private static String  type="d";
	private static String  username="lgc";
	private static String password="cisoft";
	
	public static void main(String[] args) {
		try{
			Login login=LoginManager.factory(type);
			boolean fa=login.verify(username, password);
			if(fa){
				System.out.println("µÇÂ½³É¹¦");
			}else{
				System.out.println("µÇÂ½Ê§°Ü");
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}	
	}

}
