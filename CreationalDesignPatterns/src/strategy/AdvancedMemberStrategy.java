package strategy;

public class AdvancedMemberStrategy implements MemberStrategy{

	@Override
	public double calcPrice(double booksPrice) {
		//�߼���Ա 8��
		System.out.println("�߼���Ա8��");
		return booksPrice*0.8;
	}

}
