package Bridge.client;

import Bridge.AbstractMessage;
import Bridge.JJMessage;
import Bridge.MessageEmail;
import Bridge.MessageImplementor;
import Bridge.MessageSMS;
import Bridge.TJMessage;

public class Test {

	public static void main(String[] args) {
		//����ģʽ
		/**
		 * ����ģʽ���ŵ�
����			�񡡡���������ʵ�ֲ���
����				����ģʽ�����˳��󲿷ֺ�ʵ�ֲ��֣��Ӷ�������ṩ��ϵͳ������ԡ��ó��󲿷ֺ�ʵ�ֲ��ֶ���������
				�ֱ���ӿڣ��������ڶ�ϵͳ���зֲ㣬�Ӷ��������õĽṹ����ϵͳ��
����			�񡡡����õ���չ��
����				����ģʽʹ�ó��󲿷ֺ�ʵ�ֲ��ֿ��Էֱ��������չ���������໥Ӱ�죬�Ӷ���������ϵͳ�Ŀ���չ�ԡ�
		 */
		MessageImplementor mi=new MessageSMS();
		AbstractMessage am=new JJMessage(mi);
		am.send("�Ӽ�����", "����");
		
		mi=new MessageEmail();
		am=new TJMessage(mi);
		am.send("��������", "����");

	}

}
