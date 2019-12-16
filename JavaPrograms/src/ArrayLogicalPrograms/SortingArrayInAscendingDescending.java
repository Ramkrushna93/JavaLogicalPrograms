package ArrayLogicalPrograms;

import java.util.Arrays;
import java.util.Collections;

public class SortingArrayInAscendingDescending {
	
	public static void main(String[] args) {
		
		String string[]= {"One", "Two", "Three", "Four", "Five", "six"};
		
		System.out.println("-----Array value Before Shoting");
		for(String stringvalue : string) {
			
			System.out.println(stringvalue);		
		}
		
		Arrays.sort(string);
		
		System.out.println("------After shoting in Ascending order-----");
		
		for(String stringvalue: string) {
			
			System.out.println(stringvalue);
		}
			Arrays.sort(string, Collections.reverseOrder());
			
			System.out.println("------After shoting in Descending order------");
			
			for(String stringvalue: string) {
				
				System.out.println(stringvalue);
				
			}
		}
	}


