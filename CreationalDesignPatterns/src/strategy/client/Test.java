package strategy.client;

import strategy.AdvancedMemberStrategy;
import strategy.MemberStrategy;
import strategy.strategy.Price;

public class Test {

	public static void main(String[] args) {
		/**
		 * ����ģʽ
		 * ����ģʽ���ŵ�
����			��1������ģʽ�ṩ�˹�����ص��㷨��İ취��������ĵȼ��ṹ������һ���㷨����Ϊ�塣ǡ��ʹ�ü̳п��԰ѹ����Ĵ����Ƶ��������棬�Ӷ���������ظ���
����			��2��ʹ�ò���ģʽ���Ա���ʹ�ö�������(if-else)��䡣����������䲻��ά�������Ѳ�ȡ��һ���㷨���ȡ��һ����Ϊ���߼����㷨����Ϊ���߼������һ��ͳͳ����һ����������������棬��ʹ�ü̳еİ취��Ҫԭʼ�����
		       ����ģʽ��ȱ��
����			��1���ͻ��˱���֪�����еĲ����࣬�����о���ʹ����һ�������ࡣ�����ζ�ſͻ��˱��������Щ�㷨�������Ա���ʱѡ��ǡ�����㷨�ࡣ����֮������ģʽֻ�����ڿͻ���֪���㷨����Ϊ�������
����			��2�����ڲ���ģʽ��ÿ������Ĳ���ʵ�ֶ�������װ��Ϊ�࣬�����ѡ�Ĳ��Ժܶ�Ļ�����ô�������Ŀ�ͻ�ܿɹۡ�
		 */
		MemberStrategy ms=new AdvancedMemberStrategy();
		Price price=new Price(ms);
		double bookprice= price.quote(500);
		System.out.println("�鱾�۸�"+bookprice);
	}

}
