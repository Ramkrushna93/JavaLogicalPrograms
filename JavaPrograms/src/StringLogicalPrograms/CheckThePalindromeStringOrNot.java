package StringLogicalPrograms;

import java.util.Scanner;

public class CheckThePalindromeStringOrNot {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter string");
		
		String str=sc.next();
		String data=str;
		
		int len=data.length();
		String rev="";
		
		for(int i=len-1; i>=0; i--) {
			
			rev=rev+data.charAt(i);
		}
		
		if(data.equals(rev)) {
			
			System.out.println(data+"   It is a palindrone string");
		} else {
			System.out.println(data+"   It is not a palindrone string");
		}
		
	}

}
