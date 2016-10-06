package sort.shell;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shellSort();
	}

	
	private static void shellSort(){
		int[] nums={1,354,33,333,3455,341,405,44,3,2,3345};
		int len=nums.length;
		int j=0;
		int temp=0;
		for(int z=len/2;z>0;z/=2){
			for(int i=z;i<len;i++){
				temp=nums[i];
				for(j=i;j>=z;j-=z){
					if(temp<nums[j-z]){
						nums[j]=nums[j-z];
					}else{
						break;
					}
				}
				nums[j]=temp;
			}
			
		}
		System.out.println(Arrays.toString(nums));
	}
}
