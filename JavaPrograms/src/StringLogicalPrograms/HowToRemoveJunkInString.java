package StringLogicalPrograms;

public class HowToRemoveJunkInString {
	
	public static void main(String[] args) {
		
		String s="1234@%$#&RAJU@$!$SELENIUM@@%&*&";
		
		String s1=s.replaceAll("[^A-Za-z0-9]","");
		
		System.out.println(s1);
	}

}
