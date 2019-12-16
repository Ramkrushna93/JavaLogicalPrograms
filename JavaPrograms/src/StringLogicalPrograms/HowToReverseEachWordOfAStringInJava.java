package StringLogicalPrograms;

public class HowToReverseEachWordOfAStringInJava {

	public static void reversecharacter(String s) {

		String[] words = s.split("");

		String reverseString = "";

		for (int i = 0; i< words.length; i++) {

			String word = words[i];

			String reverseWord = "";

			for (int j = word.length() - 1; j >= 0; j--) {

				reverseWord = reverseWord + word.charAt(j);
			}
		
			reverseString = reverseString + reverseWord + "";

		}
        System.out.println(s);
		System.out.println(reverseString);
		
	}
	
	public static void main(String[] args) {
		reversecharacter("My Country Is India");
	}

}
