package strategy;

public class IntermediateMemberStrategy implements MemberStrategy {

	@Override
	public double calcPrice(double booksPrice) {
		//�м���Ա9��
		System.out.println("�м���Ա9��");
		return booksPrice*0.9;
	}

}
