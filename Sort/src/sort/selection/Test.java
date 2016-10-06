package sort.selection;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		selectionSort();
	}

	
	private static void selectionSort(){
		int[] nums={1,10,3,2,44,11,90};
		int len=nums.length;
		int minIndex,temp;
		for (int i=0;i<len-1;i++) {
			minIndex=i;
			for(int j=i+1;j<len;j++){
				if(nums[j]>nums[minIndex]){
					minIndex=j;
				}
			}
			temp=nums[i];
			nums[i]=nums[minIndex];
			nums[minIndex]=temp;
		}
		System.out.println(Arrays.toString(nums));
	}
}
