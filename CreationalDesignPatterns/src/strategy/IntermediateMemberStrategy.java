package strategy;

public class IntermediateMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {
		//中级会员9折
		System.out.println("中级会员9折");
		return booksPrice*0.9;
	}

}
