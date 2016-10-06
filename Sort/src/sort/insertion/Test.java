package sort.insertion;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertionSort();
		binaryInsertionSort();
	}

	
	private static void insertionSort(){
		int[] nums={1,90,2,33,4,25,15,3,-1};
		for(int i=1;i<nums.length;i++){
			int key =nums[i];
			int j=i-1;
			while(j>=0&&nums[j]>key){
				nums[j+1]=nums[j];
				j--;
			}
			nums[j+1]=key;
		}
		System.out.println(Arrays.toString(nums));
	}
	
	private static void binaryInsertionSort(){
		int[] nums={1,90,2,33,4,25,15,3,-1};
		for(int i=1;i<nums.length;i++){
			int key=nums[i],left=0,right=i-1;
			while(left<=right){
				int middle=(left+right)/2;
				if(key<nums[middle]){
					right=middle-1;
				}else{
					left=middle+1;
				}
			}
			for(int j=i-1;j>=left;j--){
				nums[j+1]=nums[j];
			}
			nums[left]=key;
		}
		System.out.println(Arrays.toString(nums));
	}
}
