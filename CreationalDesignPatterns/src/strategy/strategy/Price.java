package strategy.strategy;

import strategy.MemberStrategy;

public class Price {

	private MemberStrategy memberStrategy;
	
	
	public Price(MemberStrategy memberStrategy) {
		this.memberStrategy=memberStrategy;
	}
	
	public double quote(double bookprice){
		return memberStrategy.calcPrice(bookprice);
	}
}
