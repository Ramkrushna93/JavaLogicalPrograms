package ArrayLogicalPrograms;

import java.util.Arrays;

public class ConcatenateTwoArrayWithOutUsingArrayCopy {
	
	public static void main(String[] args) {
		
		int[] array1= {1,2,3,4,5};
		int[] array2= {6,7,8,9};
		
		int length=array1.length+array2.length;
		
		int[] result=new int[length];
		
		int pos=0;
		
		for(int element :array1) {
			result[pos]= element;
			pos++;
		}
		
		for(int element : array2) {
			result[pos] = element;
			pos++;
		}
		System.out.println(Arrays.toString(result));
	}

}
