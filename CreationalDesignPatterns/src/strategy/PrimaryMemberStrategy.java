package strategy;

public class PrimaryMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {
		System.out.println("������Աû���ۿ�");
		return booksPrice;
	}

}
