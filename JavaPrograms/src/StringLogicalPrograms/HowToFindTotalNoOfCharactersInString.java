package StringLogicalPrograms;

public class HowToFindTotalNoOfCharactersInString {
	
	public static void main(String[] args) {
		
		String string="Bhubaneswar 145325 @#$";
		
		int count=0;
		
		for(int i=0; i<string.length(); i++) {
			
			if(Character.isLetter(string.charAt(i))) 
				
				count++;
					
		}
			
			System.out.println("Total Number of Characters in String    "+count);
	
	}

}
