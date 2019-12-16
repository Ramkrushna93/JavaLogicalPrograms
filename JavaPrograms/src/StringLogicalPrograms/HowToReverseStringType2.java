package StringLogicalPrograms;

import java.util.Scanner;

public class HowToReverseStringType2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String str = s.nextLine();

		char[] ch = str.toCharArray();

		String rev = "";

		for (int i = ch.length - 1; i >= 0; i--) {

			rev = rev + ch[i];
		}
		System.out.println(rev);

	}

}
