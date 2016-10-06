package template;

public class MoneyMarketAccount extends Account {

	@Override
	public String doCalulaAccountType() {
		return "Moeny market";
	}

	@Override
	public double doCalulateInterestRate() {
		// TODO Auto-generated method stub
		return 0.045;
	}

}
