package ArrayLogicalPrograms;

import java.util.Arrays;

public class HowToCheckEqalityOfThoArrayInJava {

	public static void main(String[] args) {

		int[] arrayone = { 2, 5, 1, 7, 4 };
		int[] arraytwo = { 2, 5, 1, 7, 1 };
   // 1st logic
		boolean EqalOrnot = true;

		if (arrayone.length == arraytwo.length) {

			for (int i = 0; i < arrayone.length; i++) {

				if (arrayone[i] != arraytwo[i]) {

					EqalOrnot = false;
				}
			}
		}
		if (EqalOrnot) {
			System.out.println("Two Array Are Eqal");

		} else {

			System.out.println("Two Array Are Not Eqal");

		}
		
		// 2nd logic with inbuild method
//		
//		boolean status=Arrays.equals(arrayone, arraytwo);
//		
//		if(status==true) {
//			
//			System.out.println("Two arrays are equal");
//		} else {
//			
//			System.out.println("Two arrays are not equal");
//		}
//				
				

	}
}
