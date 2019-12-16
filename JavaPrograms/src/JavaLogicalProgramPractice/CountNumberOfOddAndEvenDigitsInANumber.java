package JavaLogicalProgramPractice;

public class CountNumberOfOddAndEvenDigitsInANumber {
	
	public static void main(String[] args) {
		
		int num=1234567;
		
		int evennumber=0;
		int oddnumber=0;
		
		while(num>0) {
			
			int rem=num%10;
			
			if(rem%2==0) {
				
				evennumber++;
			}else {
				oddnumber++;
			}
			
			num=num/10;
		}
		System.out.println("Even digits are   "+evennumber);
		System.out.println("Odd digits are    "+oddnumber);
		
	}

}
