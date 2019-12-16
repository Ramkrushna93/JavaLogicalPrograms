package ArrayLogicalPrograms;

public class Find2MaximumInAnArray {
	
	
	public static void printTwoMaximumNumber(int numbers[]) {
		
		int maxone=0;
		int maxtwo=0;
		
		for(int number : numbers) {
			
			if(maxone < number) {
				maxone=maxtwo;
				maxone=number;
				
			} else if(maxtwo < number) {
				
				maxtwo=number;
					
			}
		}
			
			System.out.println("First maximum number in array "+maxone);
			System.out.println("Second maximum number in array "+maxtwo);	
	}
	
	public static void main(String[] args) {
		
		int[] numbers= {1,50,600,-800,900,1000,35,50,500}; 
		printTwoMaximumNumber(numbers);
	}

}
