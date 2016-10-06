package template;

public class CDAAccount extends Account {

	@Override
	public String doCalulaAccountType() {
		// TODO Auto-generated method stub
		return "CDA ";
	}

	@Override
	public double doCalulateInterestRate() {
		// TODO Auto-generated method stub
		return 0.06;
	}

}
