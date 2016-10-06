package sort.merge;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] str={1,333,2,334,23,123,22,12};
		sort(str,0,str.length-1);
		System.out.println(Arrays.toString(str));
	}

	
	
	private static void sort(int[] data,int left,int right){
		
		if(left>=right){
			return;
		}
		//�ҳ��м�����
		int center=(left+right)/2;
		//���������ݹ�
		sort(data,left,center);
		//���ұ�����ݹ�
		sort(data,center+1,right);
		//�ϲ�
		merge(data,left,center,right);
	}
	
	private static void merge(int[] data,int left,int center,int right  ){
		//��ʱ����
		int[] tmpar=new int[data.length];
		//�������һ��Ԫ������
		int mid=center+1;
		//��¼��ʱ��������
		int third=left;
		//�����������һ��Ԫ������
		int tmp=left;
		while(left<=center&&mid<=right){
			if(data[left]<data[mid]){
				tmpar[third++]=data[left++];
			}else{
				tmpar[third++]=data[mid++];
			}
		}
		while(mid<=right){
			tmpar[third++]=data[mid++];
		}
		while(left<=center){
			tmpar[third++]=data[left++];
		}
		while(tmp<=right){
			data[tmp]=tmpar[tmp++];
		}
	}
}
