package sort.maopao;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		//maopao();
		//newMaopao();
		zjmaopao();
	}

	private static void maopao(){
		int[]  numstr={10,1,23,33,11,5};
		int len =numstr.length;
		for(int i=0;i<len;i++){
			for(int j=0;j<len-1-i;j++){
				if(numstr[j]>numstr[j+1]){
					int temp=numstr[j+1];
					numstr[j+1]=numstr[j];
					numstr[j]=temp;
					
					
				}
			}
		}
		System.out.println(Arrays.toString(numstr));
		
	}
	
	private static void newMaopao(){
		/**
		 * 改进后的 
		 */
		int[]  numstr={10,1,23,33,11,5};
		
		int i=numstr.length-1;
		while(i>0){
			int pos=0;
			for(int j=0;j<i;j++){
				if(numstr[j]>numstr[j+1]){
					pos=j;
					int tmp=numstr[j];
					numstr[j]=numstr[j+1];
					numstr[j+1]=tmp;
				}
			
			}
			i=pos;
		}
		System.out.println(Arrays.toString(numstr));
	}
	
	
	private static void zjmaopao(){
		int[]  numstr={10,1,23,33,11,5};
		int low=0;
		int hight=numstr.length-1;
		int tmp,j;
		while (low<hight) {
			for(j=low;j<hight;j++){
				if(numstr[j]>numstr[j+1]){
					tmp=numstr[j];
					numstr[j]=numstr[j+1];
					numstr[j+1]=tmp;
				}
			}
			--hight;
				
		}
		System.out.println(Arrays.toString(numstr));
	}
}
