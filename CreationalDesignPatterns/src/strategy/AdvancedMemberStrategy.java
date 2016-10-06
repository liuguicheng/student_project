package strategy;

public class AdvancedMemberStrategy implements MemberStrategy{

	@Override
	public double calcPrice(double booksPrice) {
		//高级会员 8折
		System.out.println("高级会员8折");
		return booksPrice*0.8;
	}

}
