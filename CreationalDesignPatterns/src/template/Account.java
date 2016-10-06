package template;

public abstract class Account {

	
	public abstract String doCalulaAccountType();
	
	public abstract double doCalulateInterestRate();
	
	private double calculateAmout(String accounttyoe){
		return 7243.0;
	}
	
	
	public final double calculateInerest(){
		double calculateInerest=doCalulateInterestRate();
		String type=doCalulaAccountType();
		double calculateamout=calculateAmout(type);
		return calculateInerest*calculateamout;
	}
}
