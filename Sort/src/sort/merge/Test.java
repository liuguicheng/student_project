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
		//找出中间索引
		int center=(left+right)/2;
		//对左边数组递归
		sort(data,left,center);
		//对右边数组递归
		sort(data,center+1,right);
		//合并
		merge(data,left,center,right);
	}
	
	private static void merge(int[] data,int left,int center,int right  ){
		//临时数组
		int[] tmpar=new int[data.length];
		//右数组第一个元素索引
		int mid=center+1;
		//记录临时数组索引
		int third=left;
		//缓存左数组第一个元素索引
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
