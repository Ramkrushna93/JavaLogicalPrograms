package ArrayLogicalPrograms;

import java.util.Scanner;

public class HowToCountNumberOfCharactersticsInArray {
	
	public static void main(String[] args) {
		
		Scanner sn=new Scanner(System.in);
		
		String s=sn.nextLine();
		
				
		String[] countword=s.trim().split("");
		
		System.out.println("Number of Character In String  "+countword.length);
	}
	
	
	}


