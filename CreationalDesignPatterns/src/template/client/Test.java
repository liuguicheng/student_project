package template.client;

import template.Account;
import template.CDAAccount;
import template.MoneyMarketAccount;

public class Test {

	public static void main(String[] args) {
		
			Account account=new MoneyMarketAccount();
			double in=account.calculateInerest();
			System.out.println(in);
			account=new CDAAccount();
			in=account.calculateInerest();
			System.out.println(in);
		
	}

}
