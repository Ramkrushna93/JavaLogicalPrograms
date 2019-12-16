package StringLogicalPrograms;

public class HowToFindDuplicateCharacterInString {
	
	public static void main(String[] args) {
		
		String s="Ramkrushanmmnnsjns";
		
		int cnt=0;
		
		char[] count=s.toCharArray();
		
		System.out.println("Duplicate Character are");
		
		for(int i=0; i<s.length(); i++) {
			
			for(int j=i+1; j<s.length(); j++) {
				
				if(count[i]==count[j]) {
					
					System.out.println(count[j]);
					
					cnt++;
					break;
			}
		}
	}

}
}